import java.util.Scanner;
import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		double[] radius = new double[5];
		double height[] = new double[5];
		Cylinder[] cylinder = new Cylinder[5];
		
		for(int i = 0 ; i<radius.length;i++) {
			radius[i] = Double.parseDouble(JOptionPane.showInputDialog("Input radius "));			
			height[i] = Double.parseDouble(JOptionPane.showInputDialog("Input heigh "));
			cylinder[i] = new Cylinder(radius[i],height[i]);
		}
		
			
			JOptionPane.showMessageDialog(null, "Cylinder "+(1)+", volume="+cylinder[0].getVolume()
					+"/nCylinder "+(2)+", volume="+cylinder[1].getVolume()
			+"/nCylinder "+(3)+", volume="+cylinder[2].getVolume()
			+"/nCylinder "+(4)+", volume="+cylinder[3].getVolume()
			+"/nCylinder "+(5)+", volume="+cylinder[4].getVolume());
			
		

	}

}
