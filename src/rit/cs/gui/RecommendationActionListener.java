package rit.cs.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import jess.JessException;
import rit.cs.engine.MetricsRecommendation;
import rit.cs.engine.Recommendation;
import rit.cs.engine.RecommendationEngine;
import rit.cs.model.GetSystemStatus;
import rit.cs.model.KnowledgeBase;
import rit.cs.view.DisplayResult;
import rit.cs.view.PieChart;

/**
 * Program to get results from second form
 */
public class RecommendationActionListener implements ActionListener {

	Expertsystemop form;
	PieChart firstForm;

	public RecommendationActionListener(Expertsystemop form) {
		this.form = form;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// firstForm.getresult(base);
		form.flag = false;
		form.getresults(firstForm.base);
if(!(form.flag )) {
	GetSystemStatus status = new GetSystemStatus();
	status.retrieveSecurityStatus(firstForm.base);

	Recommendation recommend = new Recommendation();
	recommend.conversionOfMetrics(firstForm.base);
	try {
		RecommendationEngine engine = new RecommendationEngine(
				firstForm.base);

		engine.run(firstForm.base);
		String ExpertSystem = "ExpertSystem";
		String MetricsData = "MetricsData";
		MetricsRecommendation rec = new MetricsRecommendation();
		rec.metricsRecommendation(firstForm.base);
		PieChart result = new PieChart(ExpertSystem, MetricsData, firstForm.base);
		// result.createDataset(firstForm.base);
		result.pack();
		result.setVisible(true);
		DisplayResult recommendResult = new DisplayResult(firstForm.base);
		recommendResult.setVisible(true);
	} catch (JessException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
	}

}
