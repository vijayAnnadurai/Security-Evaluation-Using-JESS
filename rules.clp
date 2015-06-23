(defglobal ?*VulMgmt* = "not def")
(defglobal ?*EquipSec* = "not def")
(defglobal ?*PwdStrength* = "not def")
(defglobal ?*IncidentRisk* = "not def")
(defglobal ?*RiskAssess* = "not def")
(defglobal ?*screenedPercent* = "not def")
(defglobal ?*incidentMgmt* = "not def")
(defglobal ?*UnauthAccess* = "not def")
(defglobal ?*systemSec* = "not def")


(deftemplate VulnerabilityMgmt (slot value))
(deftemplate EquipmentSecurity (slot value))
(deftemplate Negligence (slot value))
(deftemplate PasswordStrength (slot value))
(deftemplate IncidentReported (slot value))
(deftemplate RiskAssessment (slot value))
(deftemplate screenedPercent(slot value))
(deftemplate IncidentMgmt (slot value))
(deftemplate UnauthorizedAccessPercent (slot value))
(deftemplate Firewall (slot value))
(deftemplate Antivirus (slot value))
(deftemplate Test (slot value))
(deftemplate AntivirusValue(slot value))
(deftemplate FirewallValue(slot value))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;vulnerability management ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule VulMgmt_Low
 ?r<-(VulnerabilityMgmt(value ?v&:(<= ?v 33)))
=>
(bind ?*VulMgmt* "low")

(printout t "Threat execution is LOW" crlf))

(defrule VulMgmt_Medium
 ?r <-  (VulnerabilityMgmt{value > 33 && value < 67})
=>
(bind ?*VulMgmt* "medium"))


(defrule VulMgmt_High
 ?r<-(VulnerabilityMgmt(value ?v&:(>= ?v 67)))
=>
(bind ?*VulMgmt* "high"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;EquipmentSecurity;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule EquipSec_Low
 ?r<-(EquipmentSecurity(value ?v&:(<= ?v 33)))
=>
(bind ?*EquipSec* "low")
(printout t "Mitigation execution is LOW" crlf))

(defrule EquipSec_Medium
 ?r <-  (EquipmentSecurity{value > 33 && value < 67})
=>
(bind ?*EquipSec* "medium"))



(defrule EquipSec_High
 ?r<-(EquipmentSecurity(value ?v&:(>= ?v 67)))
=>
(bind ?*EquipSec* "high"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Access Control ;;;;;;;;;;;;;;;;;;;;;;;;;;;

(deftemplate accessCtrl(slot value))
(deftemplate automatedTools(slot value))
(deftemplate automatedToolsValue(slot value))

(deftemplate employIDS(slot value))
(deftemplate employIDSValue(slot value))
(deftemplate IDSToolsValue (slot value))


(defglobal ?*accessValue* = "not def")

;;;;;;;;;;;;;;;automated tools ;;;;;;;;;;;;;;;

 (defrule automatedTools_yes
 ?r <- (automatedTools (value ?v&: (eq ?v yes)))
 =>
  (assert(automatedToolsValue (value 25))))
 
 
 
 (defrule automatedTools_no
 ?r <- (automatedTools (value ?v&: (eq ?v no)))
 =>
   (assert(automatedToolsValue (value 0))))
 
 
;;;;;;;;;;;;;;;employ IDS ;;;;;;;;;;;;;;;

 (defrule employIDS_yes
 ?r <- (employIDS (value ?v&: (eq ?v yes)))
 =>
  (assert(employIDSValue (value 25))))
 
 
 
 (defrule employIDS_no
 ?r <- (employIDS (value ?v&: (eq ?v no)))
 =>
   (assert(employIDSValue (value 0))))
 
 ;;;;;;;;;;;;;;;;;;;;;;;;;;adding IDS & automated tools ;;;;;;;;;;;;;;;;;;;;;;
 
 (defrule IDSTools_low
 ?r <- (employIDSValue {value == 0})(automatedToolsValue {value == 0})
 =>
 (assert(IDSToolsValue ( value 0))))
 
 (defrule IDSTools_medium
 ?r <- (employIDSValue {value == 0})(automatedToolsValue {value == 25})
 =>
 (assert(IDSToolsValue ( value 25))))
 
 (defrule IDSTools_medium2
 ?r <- (employIDSValue {value == 25})(automatedToolsValue {value == 0})
 =>
 (assert(IDSToolsValue ( value 25))))
 
 (defrule IDSTools_high
 ?r <- (employIDSValue {value == 25})(automatedToolsValue {value == 25})
 =>
 (assert(IDSToolsValue ( value 50))))
 
 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;adding AccssCtrl & IDSTools;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 
 (defrule AccTools_1
 ?r <- (accessCtrl(value ?v&:(>= ?v 50)))(IDSToolsValue {value == 50})
 =>
 (bind ?*accessValue* "high"))

 (defrule AccTools_2
 ?r <- (accessCtrl(value ?v&:(< ?v 50)))(IDSToolsValue {value == 25})
 =>
 (bind ?*accessValue* "medium")) 
 
  (defrule AccTools_3
 ?r <- (accessCtrl(value ?v&:(< ?v 50)))(IDSToolsValue {value == 0})
 =>
 (bind ?*accessValue* "low")) 
 
  (defrule AccTools_4
 ?r <- (accessCtrl(value ?v&:(< ?v 50)))(IDSToolsValue {value == 50})
 =>
 (bind ?*accessValue* "medium")) 
 
  (defrule AccTools_5
 ?r <- (accessCtrl(value ?v&:(>= ?v 50)))(IDSToolsValue {value == 25})
 =>
 (bind ?*accessValue* "high")) 
 
 
   (defrule AccTools_6
 ?r <- (accessCtrl(value ?v&:(>= ?v 50)))(IDSToolsValue {value == 0})
 =>
 (bind ?*accessValue* "low")) 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Password Strength;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule PwdStr_Low
 ?r<-(PasswordStrength{value == 10 })
=>
(bind ?*PwdStrength* "low")

(printout t "result success" crlf))

(defrule PwdStr_Medium
 ?r <- (PasswordStrength{value == 50 })
=>
(bind ?*PwdStrength* "medium"))



(defrule PwdStr_High
 ?r<-(PasswordStrength {value == 100})
=>
(bind ?*PwdStrength* "high"))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;pwd Hierarchy ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(deftemplate passFreq(slot value))
(deftemplate passFreqValue(slot value))

(deftemplate pwdSplChar(slot value))
(deftemplate pwdSplCharValue(slot value))

(deftemplate pwdMoreChar(slot value)) 
(deftemplate pwdMoreCharValue(slot value)) 

(defglobal ?*pwdFreq* = "not def")
(defglobal ?*pwdSplChar* = "not def")
(defglobal ?*pwdMoreChar* = "not def")


(defrule pwdChangeFreq_monthly
 ?r <- (passFreq(value ?v&:( eq ?v Monthly)))
 =>
 (assert(passFreqValue (value 50)))
 (bind ?*pwdFreq* 50))
 
 (defrule pwdChangeFreq_quarterly
 ?r <- (passFreq(value ?v&:( eq ?v Quarterly)))
 =>
  (assert(passFreqValue (value 25)))
 
 (bind ?*pwdFreq* 25))
 
 (defrule pwdChangeFreq_six
 ?r <- (passFreq(value ?v&:( eq ?v 6)))
 =>
  (assert(passFreqValue (value 10)))
 
 (bind ?*pwdFreq* 10))
 
 
 ;;;;;;;;;;;;;;;;;;;;;;;;;; pwdSPL;;;;;;;;;;;;;;;;
 
 (defrule pwdSplchar_yes
 ?r <- (pwdSplChar (value ?v&: (eq ?v yes)))
 =>
  (assert(pwdSplCharValue (value 25)))
 
 (bind ?*pwdSplChar* 25))
 
 (defrule pwdSplchar_no
 ?r <- (pwdSplChar (value ?v&: (eq ?v no)))
 =>
   (assert(pwdSplCharValue (value 0)))
 
 (bind ?*pwdSplChar* 0))
 
 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;pwdMorechar;;;;;;;;;;;;;;;;
 
 
 (defrule pwdMorechar_yes
 ?r <- (pwdMoreChar (value ?v&: (eq ?v yes)))
 =>
   (assert(pwdMoreCharValue (value 25)))
 
 (bind ?*pwdMoreChar* 25))
 
 (defrule pwdMorechar_no
 ?r <- (pwdMoreChar (value ?v&: (eq ?v no)))
 =>
   (assert(pwdMoreCharValue (value 0)))
 
 (bind ?*pwdMoreChar* 0))
 
 
 ;;;;;;;;;;;;;;;;;;;;;;;;Adding ;;;;;;;;;;;;;;;;;;;;;;;;;;
 (deftemplate pwdSplMoreValue (slot value))
 (deftemplate pwdFreqSplMore (slot value))
 
 (defrule pwdSplMore_high
 ?r <- (pwdMoreCharValue{value == 25})(pwdSplCharValue {value == 25})
 =>
 (assert (pwdSplMoreValue (value 50))))
 
 
 (defrule pwdSplMore_medium
 ?r <- (pwdMoreCharValue{value == 0})(pwdSplCharValue {value == 25})
 =>
 (assert (pwdSplMoreValue (value 25))))
 
 
 (defrule pwdSplMore_medium2
 ?r <- (pwdMoreCharValue{value == 25})(pwdSplCharValue {value == 0})
 =>
 (assert (pwdSplMoreValue (value 25))))
 
 
 (defrule pwdSplMore_low
 ?r <- (pwdMoreCharValue{value == 0})(pwdSplCharValue {value ==0})
 =>
 (assert (pwdSplMoreValue (value 0))))
 
 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Freq & splChar ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 
 (defrule pwdFreqSplMore_high
 ?r <- ( pwdSplMoreValue {value == 50})(passFreqValue {value == 50})
 =>
 (assert(PasswordStrength(value 100))))
 
 
 
 (defrule pwdFreqSplMore_medium
 ?r <- ( pwdSplMoreValue {value == 25})(passFreqValue {value == 25})
 =>
 (assert(PasswordStrength(value 50))))
 
 (defrule pwdFreqSplMore_low
 ?r <- ( pwdSplMoreValue {value == 0})(passFreqValue {value == 10})
 =>
 (assert(PasswordStrength(value 10))))
 
 (defrule pwdFreqSplMore_medium2
 ?r <- ( pwdSplMoreValue {value == 50})(passFreqValue {value == 25})
 =>
 (assert(PasswordStrength(value 50))))
 
 
 
 (defrule pwdFreqSplMore_medium3
 ?r <- ( pwdSplMoreValue {value == 25})(passFreqValue {value == 50})
 =>
 (assert(PasswordStrength(value 50))))
 
 
 (defrule pwdFreqSplMore_medium4
 ?r <- ( pwdSplMoreValue {value == 50})(passFreqValue {value == 10})
 =>
 (assert(PasswordStrength(value 50))))
 
 
 (defrule pwdFreqSplMore_medium5
 ?r <- ( pwdSplMoreValue {value == 0})(passFreqValue {value == 50})
 =>
 (assert(PasswordStrength(value 50))))
 
  
 (defrule pwdFreqSplMore_medium6
 ?r <- ( pwdSplMoreValue {value == 0})(passFreqValue {value == 25})
 =>
 (assert(PasswordStrength(value 10))))
 
 (defrule pwdFreqSplMore_medium7
 ?r <- ( pwdSplMoreValue {value == 25})(passFreqValue {value == 10})
 =>
 (assert(PasswordStrength(value 10))))
 
 
 
 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Incident Reported & Risk Assessment;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule Incident_Risk_Low
 ?r<-(IncidentReported(value ?v&:(<= ?v 50)))(RiskAssessment(value ?v&:(<= ?v 50)))
=>
(bind ?*IncidentRisk* "low")

(printout t "Negligence execution is LOW" crlf))

(defrule Incident_Risk_Medium
 ?r <- (IncidentReported(value ?v&:(<= ?v 50)))(not(RiskAssessment(value ?v&:(<= ?v 50))))
        
       
 =>
(bind ?*IncidentRisk* "medium"))

(defrule Incident_Risk_Medium2
 ?r <- (RiskAssessment(value ?v&:(<= ?v 50)))(not(IncidentReported(value ?v&:(<= ?v 50))))
        
       
 =>
(bind ?*IncidentRisk* "medium"))


(defrule Incident_Risk_High
 ?r<-(IncidentReported(value ?v&:(> ?v 50)))(RiskAssessment(value ?v&:(> ?v 50)))
=>
(bind ?*IncidentRisk* "high"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Risk Assessment;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule RiskAssess_Low
 ?r<-(RiskAssessment(value ?v&:(<= ?v 33)))
=>
(bind ?*RiskAssess* "low")
(printout t "RiskAssess execution is LOW" crlf))

(defrule RiskAssess_Medium
 ?r <-  (RiskAssessment(value ?v&:(> ?v 33))) (RiskAssessment(value ?v&:(< ?v 67)))
=>
(bind ?*RiskAssess* "medium"))



(defrule RiskAssess_High
 ?r<-(RiskAssessment(value ?v&:(>= ?v 67)))
=>
(bind ?*RiskAssess* "high"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;ScreenedPercent;;;;;;;;;;;;;;;;;;;;;;;

(defrule ScreenedPercent_Low
 ?r<-(screenedPercent(value ?v&:(<= ?v 33)))
=>
(bind ?*screenedPercent* "low")
(printout t "incidentMgmt execution is LOW" crlf))

(defrule ScreenedPercent_Medium
 ?r <-  (screenedPercent(value ?v&:(> ?v 33))) (screenedPercent(value ?v&:(< ?v 67)))
=>
(bind ?*screenedPercent* "medium"))



(defrule ScreenedPercent_High
 ?r<-(screenedPercent(value ?v&:(>= ?v 67)))
=>
(bind ?*screenedPercent* "high"))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;UnAuthorizedAccessPoint;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule UnauthAccess_Low
 ?r<-(UnauthorizedAccessPercent(value ?v&:(<= ?v 33)))
=>
(bind ?*UnauthAccess* "low")
(printout t "UnauthAccess execution is LOW" crlf))

(defrule UnauthAccess_Medium
 ?r <-  (UnauthorizedAccessPercent(value ?v&:(> ?v 33))) (UnauthorizedAccessPercent(value ?v&:(< ?v 67)))
=>
(bind ?*UnauthAccess* "medium"))



(defrule UnauthAccess_High
 ?r<-(UnauthorizedAccessPercent(value ?v&:(>= ?v 67)))
=>
(bind ?*UnauthAccess* "high"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Firewall;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule Firewall_no
 ?r<-(Firewall(value ?v&:(eq ?v no)))
=>
(bind ?*Firewall* "low")
(assert(FirewallValue (value 50)))
(printout t "Firewall execution is LOW" crlf))


(defrule Firewall_yes
 ?r<-(Firewall(value ?v&:(eq ?v yes)))
=>
(assert(FirewallValue (value 100)))
(bind ?*Firewall* "high"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Antivirus;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule Antivirus_no
 ?r<-(Antivirus(value ?v&:( eq ?v no)))
=>
(bind ?*Antivirus* "low")
(assert(AntivirusValue (value 50)))
(printout t "Antivirus execution is LOW" crlf))


(defrule Antivirus_yes
 ?r<-(Antivirus(value ?v&:( eq ?v yes)))
=>
(assert(AntivirusValue (value 100)))
(printout t "Antivirus execution is LOW" crlf)
(bind ?*Antivirus* "high"))

;;;;;;;;;;;;;;;;;;;;;Firewall & Antivirus ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defrule systemSec_low
 (AntivirusValue {value == 50})(FirewallValue {value == 50}) 
 =>
 (bind ?*systemSec* "low"))
 
 (defrule systemSec_medium1
 (AntivirusValue {value == 50})(FirewallValue {value == 100}) 
 =>
 (bind ?*systemSec* "medium"))
 
 (defrule systemSec_medium2
 (AntivirusValue {value == 100})(FirewallValue {value == 50}) 
 =>
 (bind ?*systemSec* "medium"))
 
 (defrule systemSec_high
 (AntivirusValue {value == 100})(FirewallValue {value == 100}) 
 =>
 (bind ?*systemSec* "high"))

