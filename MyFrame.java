import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
	extends JFrame
	implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JLabel name2;
    private JLabel name3;
	private JLabel name4;
    private JLabel name5;
	private JTextField tname;
    private JTextField tname2;
    private JTextField tname3;
	private JTextField tname4;
	private JTextField tname5;
	private JButton sub;
	private JTextArea tout;
	private JLabel res;
	public MyFrame()
	{
		setTitle("Results");
		setContentPane(new JLabel(new ImageIcon("/Users/yashasvi/Downloads/—Pngtree—watercolor crow_1380518.png")));
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Grade Calculator");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		name = new JLabel("MTH 402");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);

		name2 = new JLabel("CSE 310");
		name2.setFont(new Font("Arial", Font.PLAIN, 20));
		name2.setSize(100, 20);
		name2.setLocation(100, 150);
		c.add(name2);

        tname2 = new JTextField();
		tname2.setFont(new Font("Arial", Font.PLAIN, 15));
		tname2.setSize(190, 20);
		tname2.setLocation(200, 150);
		c.add(tname2);

        name3 = new JLabel("CSE 408");
		name3.setFont(new Font("Arial", Font.PLAIN, 20));
		name3.setSize(100, 20);
		name3.setLocation(100, 200);
		c.add(name3);

        tname3 = new JTextField();
		tname3.setFont(new Font("Arial", Font.PLAIN, 15));
		tname3.setSize(190, 20);
		tname3.setLocation(200,200);
		c.add(tname3);

		name4 = new JLabel("PEV 108");
		name4.setFont(new Font("Arial", Font.PLAIN, 20));
		name4.setSize(100, 20);
		name4.setLocation(100, 250);
		c.add(name4);

        tname4 = new JTextField();
		tname4.setFont(new Font("Arial", Font.PLAIN, 15));
		tname4.setSize(190, 20);
		tname4.setLocation(200,250);
		c.add(tname4);

		name5 = new JLabel("INT 404");
		name5.setFont(new Font("Arial", Font.PLAIN, 20));
		name5.setSize(100, 20);
		name5.setLocation(100, 300);
		c.add(name5);

        tname5 = new JTextField();
		tname5.setFont(new Font("Arial", Font.PLAIN, 15));
		tname5.setSize(190, 20);
		tname5.setLocation(200,300);
		c.add(tname5);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 20));
		sub.setSize(100, 50);
		sub.setLocation(200, 400);
		sub.addActionListener(this);
		c.add(sub);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 20));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("RESULTS");
		res.setFont(new Font("Arial", Font.BOLD, 30));
		res.setSize(500, 50);
		res.setLocation(100, 500);
		c.add(res);
		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
				double data= Double.parseDouble(tname.getText());
				double data2= Double.parseDouble(tname2.getText());
				double data3= Double.parseDouble(tname3.getText());
				double data4= Double.parseDouble(tname4.getText());
				double data5= Double.parseDouble(tname5.getText());
				//if(data>100||data2>100||data3>100||data4>100||data5>100)
				String answer="Grade in MTH 402 :"+grading(data)+"\nGrade in CSE 310 :"+grading(data2)+"\nGrade in CSE 408 :"+grading(data3)+"\nGrade in PEV 108 :"+grading(data4)+"\nGrade in INT 404 :"+grading(data5);
				tout.setText(answer);
				tout.setEditable(false);
				res.setText("Your Final Grade is :"+grading((data+data2+data3+data4+data5)/5));
		}
	}
	public String grading(double d){
		if(d>=90)
		return "A";
		else if(d>=80)
		return "B";
		else if(d>=65)
		return "C";
		else if(d>=50)
		return "D";
		else if(d>=40)
		return "E";
		else
		return "F";	
	}
    public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();
	}
}