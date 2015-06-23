package rit.cs.view;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;
import rit.cs.gui.Expertsystem;
import rit.cs.model.KnowledgeBase;

/**
 * Program contains main class
 * It will display Piechart for metrics
 */
public class PieChart extends JFrame {
	public static KnowledgeBase base = new KnowledgeBase();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Expertsystem window = new Expertsystem(base);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        // PieChart demo = new PieChart("Comparison", "System's Performance",base);
         //demo.pack();
         //demo.setVisible(true);
         
     }

	

  private static final long serialVersionUID = 1L;

  public PieChart(String applicationTitle, String chartTitle ,KnowledgeBase base ) {
        super(applicationTitle);
       
        PieDataset dataset = createDataset(base);
        
        JFreeChart chart = createChart(dataset, chartTitle);
        
        ChartPanel chartPanel = new ChartPanel(chart);
       
        
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        
        setContentPane(chartPanel);
       
        

    }
    
    
/**
     * Creates a sample dataset 
     */

    public  PieDataset createDataset(KnowledgeBase base) {
    	
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("VulnerabilityMgmt("+base.getResultVulMgmt()+")",base.getVulnerabilityMgmt() );
        result.setValue("Access Ctrl("+base.getResultAccessVal()+")" , base.getAccessCtrl());
        result.setValue("Environmental("+base.getResultequipSec()+")",base.getPhysical());
       // result.setValue("Pwd",base.);
        result.setValue("Incident("+base.getResultUnauthAccess()+")", base.getIncident());
        result.setValue("Risk Assessment("+base.getResultRiskAccess()+")", base.getRiskAssess() );
        return result;
        
    }
    
    
/**
     * Creates a chart
     */

    @SuppressWarnings("deprecation")
	private JFreeChart createChart(PieDataset dataset, String title) {
        
        JFreeChart chart = ChartFactory.createPieChart3D(title,          // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        plot.setSectionPaint(0, Color.RED);
        plot.setSectionPaint(1, Color.green);
        plot.setSectionPaint(2, Color.ORANGE);
        plot.setSectionPaint(3, Color.BLUE);
        plot.setSectionPaint(4, Color.DARK_GRAY);
        plot.setSectionPaint(5, Color.pink);
        
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}"));
        
        return chart;
        
    }

}