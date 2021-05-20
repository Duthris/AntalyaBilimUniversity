import javax.swing.JOptionPane;

public class RandomAddGUI {
	public static void main(String[] args) {
		
		
	for (int i=0; i<5; i++) {
	int x = (int) (Math.random()*100+1);
	int y = (int) (Math.random()*100+1);	
	
	int sum=x+y;
	String msg=String.format("%d + %d = ?", x,y);
	String answer=JOptionPane.showInputDialog(msg);
	
	if (Integer.parseInt(answer) == sum)
		JOptionPane.showMessageDialog(null, "It is correct!");
	
	else
		JOptionPane.showMessageDialog(null, "Sorry! the correct answer is " + sum);
		
	 }

   }
}