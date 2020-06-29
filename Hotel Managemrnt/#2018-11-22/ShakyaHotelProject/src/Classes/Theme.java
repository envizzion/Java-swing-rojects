package Classes;

import com.alee.laf.WebLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Hasitha Udara
 */
public class Theme {

    public static void main(String[] args) {
        try {
//            WebLookAndFeel.install();
//            WebLookAndFeel.initializeManagers();
//            WebLookAndFeel.setAllowLinuxTransparency(true);
//            WebLookAndFeel.setDecorateAllWindows(true);
//
//            WebLookAndFeel.setDecorateFrames(true);
//            WebLookAndFeel.isLeftToRight();
//            new GUI.Login().setVisible(true);

            LookAndFeel a = new SyntheticaSimple2DLookAndFeel();
            UIManager.setLookAndFeel(a);
            JFrame.setDefaultLookAndFeelDecorated(true);
             new GUI.Login().setVisible(true);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
