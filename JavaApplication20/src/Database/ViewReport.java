/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.awt.Container;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Acer
 */
public class ViewReport extends JFrame{
    
    public ViewReport(String fileName){
    
        this(fileName,null);
    
    }
    
    public ViewReport(String fileName,HashMap para){
    
        super("Samurdhi Bank Kuliyapitiya");
    
        Dbconnection db= new Dbconnection();
        try{
        Connection c= Dbconnection.mycon();
        
        JasperPrint print=JasperFillManager.fillReport(fileName,para,c);
        JRViewer viewer = new JRViewer(print);
        Container c1=getContentPane();
        c1.add(viewer);
        }
        catch(Exception e){e.printStackTrace();}
        
        setBounds(10,10,900,700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public ViewReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void reportsToPDF(String sourcePath, String destPath) {
        try {
            Connection c= Dbconnection.mycon();
            String rutaInforme = sourcePath;
            JasperPrint informe = JasperFillManager.fillReport(rutaInforme, null, c);
            JasperExportManager.exportReportToPdfFile(informe, destPath);

            JasperViewer ventanavisor = new JasperViewer(informe, false);
            ventanavisor.setTitle("Samurdhi Bank Reports");
            ventanavisor.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    
    }
    
