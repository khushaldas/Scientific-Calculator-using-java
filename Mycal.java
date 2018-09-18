/**
 *
 * @author Khushal Das
 */
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javafx.scene.control.RadioButton;
import javax.swing.border.EmptyBorder;
import  javax.swing.event.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
public class Mycal extends Main implements ActionListener{
    JFrame frame;
    JTextField textFieldInput_1;
    JButton one,pow,sin,cos,tan,two,three,four,five,six,seven,eight,nine,zero,plus,mult,div,minus,mod,equal,dot,Sqrt;
    JButton MC,MR,MS,M_plus,M_neg,plus_minus,C,CE,back_arrow,breaket_strat,breaket_end,ln,lnv,Int,sinh,cosh,tanh,x_squire;
    JButton fact,one_by,y_redical_x,x_redical_3,x_pow_y,dms,pi,x_cube,base_10_pow,log,F_E,percent;
    JRadioButton Degree,radian,Grads; 
    JToolBar t1,t2,t3;
    double mem;
    public Mycal(){
        initializeComponent();
    }
   
    private void initializeComponent(){
        
	frame = new JFrame("Calculator");
	one = new JButton ("1");
	two = new JButton("2");
        three = new JButton("3");
	four = new JButton("4");
	five = new JButton("5");
	six = new JButton("6");
	seven = new JButton("7");
	eight = new JButton("8");
	nine = new JButton("9");
	zero = new JButton("0");
	mult = new JButton("*");
	plus = new JButton("+");
	mod = new JButton("%");
	minus = new JButton("-");
	div = new JButton("/");
        equal = new JButton("=");
        dot = new JButton(".");
        Sqrt = new JButton("sqrt");
        pow = new JButton("pow");
	sin = new JButton("sin");
	cos = new JButton("cos");
	tan = new JButton("tan");
        MC = new JButton("MC"); 
        MR= new JButton("MR");
        MS= new JButton("MS"); 
        M_plus = new JButton("M+");
        M_neg= new JButton("M-");
        plus_minus=new JButton("-+");
        C=new JButton("C");
        CE= new JButton("CE");
        ImageIcon icon = new ImageIcon("pic1.png");
        back_arrow=new JButton(icon);
        breaket_strat= new JButton("(");
        breaket_end=new JButton(")");
        ln = new JButton("ln");
        lnv=new JButton("lnv");
        Int=new JButton("Int");
        sinh= new JButton("sinh");
        cosh= new JButton("cosh");
        tanh= new JButton("tanh");
        x_squire= new JButton("x squire");
        fact=new JButton("n!");
        one_by=new JButton("1/x");
        y_redical_x=new JButton("yredicalx");
        x_redical_3=new JButton("xredical3");
        x_pow_y=new JButton("xpowy");
        dms=new JButton("dms");
        pi=new JButton("pi");
        x_cube=new JButton("x cube");
        base_10_pow=new JButton("10powx");
        log=new JButton("log");
        percent=new JButton("%");
        F_E=new JButton("F-E");
        Degree= new JRadioButton("Degree",true);
        radian=new JRadioButton("Rad");
        Grads= new JRadioButton("Grads");
        t1 = new JToolBar("View");
        t2 = new JToolBar("Edit");
        t3 = new JToolBar("Help");
	textFieldInput_1 = new JTextField(18);
        
        Font f = new Font("nothing", 1, 25);
        textFieldInput_1.setFont(f);
        Container c;
        c = frame.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 6, 4));
        c.setBackground(Color.blue);
        JPanel heading = new JPanel();  
        t1.add(new JButton("View   "));
        t2.add(new JButton("Edit   "));
        t3.add(new JButton("Help"));
     
        heading.add(t1);
        heading.add(t2);
        heading.add(t3);
        heading.setBackground(Color.blue);
        heading.setLayout(new FlowLayout(FlowLayout.RIGHT));
        c.add(heading);
// adding text area throug panel to caontainer
        JPanel p = new JPanel();      
        p.add(textFieldInput_1);
        c.add(p);
    
//adding radio buttons in one Group to select one at a time
    ButtonGroup bg = new ButtonGroup();
    bg.add(Degree);
    bg.add(radian);
    bg.add(Grads);
    
    JPanel p1 = new JPanel();// creating new panel
    p1.setBackground(Color.blue);
    p1.add(Degree);   
    p1.add(radian);   
    p1.add(Grads);  
    p1.add(MC);    
    p1.add(MR);    
    p1.add(MS);    
    p1.add(M_plus);     
    p1.add(M_neg);
    c.add(p1);
    
    
//adding remaing buttons to container
    
    c.add(new JButton("  "));
    c.add(lnv);  c.add(ln);  
    c.add(breaket_strat); c.add(breaket_end);   
    c.add(back_arrow);c.add(CE);  
    c.add(C);  c.add(plus_minus); 
    c.add(Sqrt); c.add(Int);
    c.add(sinh);  c.add(sin);  
    c.add(x_squire); c.add(fact); 
    c.add(seven);  c.add(eight);  
    c.add(nine); c.add(div); 
    c.add(percent);c.add(dms);  
    c.add(cosh);  c.add(cos); 
    c.add(x_pow_y); c.add(y_redical_x);
    c.add(four);  c.add(five); 
    c.add(six); c.add(mult); 
    c.add(one_by);c.add(pi);  
    c.add(tanh);  c.add(tan); 
    c.add(x_cube); c.add(x_redical_3);
    c.add(one);  c.add(two);  
    c.add(three); c.add(minus);
    c.add(equal);c.add(F_E);   
    c.add(pow);  c.add(mod);  
    c.add(log); c.add(base_10_pow); 
    c.add(zero);c.add(dot);   c.add(plus); 
      
 
//register the buttons with event handler
    
    one.addActionListener(this);    two.addActionListener(this);     three.addActionListener(this);
    four.addActionListener(this);   five.addActionListener(this);    six.addActionListener(this);
    seven.addActionListener(this);  eight.addActionListener(this);   nine.addActionListener(this);
    zero.addActionListener(this);   mult.addActionListener(this);    minus.addActionListener(this);
    plus.addActionListener(this);   dot.addActionListener(this);     Sqrt.addActionListener(this);
    div.addActionListener(this);    mod.addActionListener(this);     equal.addActionListener(this);  
    sin.addActionListener(this);    cos.addActionListener(this);     tan.addActionListener(this);    
    pow.addActionListener(this);    MC.addActionListener(this);      MR.addActionListener(this);
    MS.addActionListener(this);     M_plus.addActionListener(this);  M_neg.addActionListener(this);
    plus_minus.addActionListener(this);   C.addActionListener(this); CE.addActionListener(this);
    back_arrow.addActionListener(this);   breaket_strat.addActionListener(this);   breaket_end.addActionListener(this);
    ln.addActionListener(this);           lnv.addActionListener(this);             Int.addActionListener(this);
    cosh.addActionListener(this);         tanh.addActionListener(this);            x_squire.addActionListener(this);
    fact.addActionListener(this);         one_by.addActionListener(this);          y_redical_x.addActionListener(this);
    x_redical_3.addActionListener(this);  x_pow_y.addActionListener(this);         dms.addActionListener(this);
    pi.addActionListener(this);           x_cube.addActionListener(this);           base_10_pow.addActionListener(this);
    log.addActionListener(this);          F_E.addActionListener(this);              percent.addActionListener(this);
    Degree.addActionListener(this);       radian.addActionListener(this);           Grads.addActionListener(this); 
    sinh.addActionListener(this);
    
    try {
    frame.setIconImage(ImageIO.read(new File("icon.png")));
    }
    
    catch (IOException exc) {
    exc.printStackTrace();
    }
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLocation(400, 300);
    frame.setSize(490,400);
    frame.setVisible(true);
    
   }
    
   @Override
   public  void actionPerformed(ActionEvent e){
       
    String input1="";
       
    if(e.getSource()==one){
       input1="1";
    }
       
    else if(e.getSource()==two){
       input1="2";
    }

    else if(e.getSource()==three){ 
       input1="3";
    }

    else if(e.getSource()==four){
       input1="4";
    }

    else if(e.getSource()==five){
       input1="5";
    }

    else if(e.getSource()==six){
       input1="6";
    }

    else if(e.getSource()==seven){
       input1="7";
    }

    else if(e.getSource()==eight){
       input1="8";
    }

    else if(e.getSource()==nine){
       input1="9";
    }

    else if(e.getSource()==plus){
       input1="+";
    }

    else if(e.getSource()==minus){
       input1="-";
    }

    else if(e.getSource()==div){
       input1="/";
    }

    else if(e.getSource()==mult){
       input1="*";
    }

    else if(e.getSource()==dot){
       input1=".";
    }

    else if(e.getSource()==Sqrt){
       input1="sqrt";
    }
       
    else if(e.getSource()==mod){
       input1="%";
    }
       
    else if(e.getSource()==zero){
       input1="0";
    }
       
    else if(e.getSource()==sin){
       input1="sin";
    }
         
    else if(e.getSource()==cos){
        input1="cos";
 
    }
    
    else if(e.getSource()==tan){
       input1="tan";
    }
           
    else if(e.getSource()==pow){
       input1="^";
    }
    
    else if(e.getSource()==sinh){
       input1="sinh";
    }
    
    else if(e.getSource()==tanh){
       input1="tanh";
    }
    
    else if(e.getSource()==cosh){
       input1="cosh";
    }
    
    else if(e.getSource()==ln){
       input1="ln";
    }
    
    else if(e.getSource()==pi){
       input1="(3.142)";
    }
            
    else if(e.getSource()==x_cube){
       input1="^3";
    }
    
    else if(e.getSource()==x_squire){
       input1="^2";
    }
    
    else if(e.getSource()==log){
       input1="log";
    }
     
    else if(e.getSource()==breaket_strat){
       input1="(";
    }
      
    else if(e.getSource()==breaket_end){
       input1=")";
    }
    
    else if(e.getSource()==Int){
       input1="Int";
    }
      
    else if(e.getSource()==fact){
       input1 =textFieldInput_1.getText();
        if (input1 != null && input1.length() > 0 ) {
            int s = Integer.parseInt(""+eval(input1));
            for (int i=s;i>1;--i)
               s = s*i;    
            textFieldInput_1.setText(""+s);
            return;
        }  
        
    }
    
    else if(e.getSource()==x_pow_y){
        input1 ="("+textFieldInput_1.getText() + ")"+"^";
        textFieldInput_1.setText(input1);
        double s =  eval(textFieldInput_1.getText());
        return;
    }
     
    else if(e.getSource()==x_redical_3){
        input1 ="(("+textFieldInput_1.getText() + ")"+"^"+"0.3333)";
        textFieldInput_1.setText(input1);
        double s =  eval(textFieldInput_1.getText());
        return;
    }
       
    else if(e.getSource()==one_by){
        input1 ="1/("+textFieldInput_1.getText() + ")";
        textFieldInput_1.setText(""+input1);
        double s =  eval(textFieldInput_1.getText());
        return;
    }
       
    else if(e.getSource()==back_arrow){
        input1 =textFieldInput_1.getText();
        if (input1 != null && input1.length() > 0 ) {
            input1= input1.substring(0, input1.length()-1);    
        }  
        textFieldInput_1.setText("");
    }
    
    else if(e.getSource() == MS){      
        String f=textFieldInput_1.getText();
        double s =  eval(f);
        mem=s;
    }
    
    else if(e.getSource() == MC){      
        mem=0;
    }
        
    else if(e.getSource() == M_plus){  
       String f=textFieldInput_1.getText();
       double s =eval(f);
       s= s+mem;
       textFieldInput_1.setText(""+s);
    }
    
    else if(e.getSource() == M_neg){  
       String f=textFieldInput_1.getText();
       double s =eval(f);
       s= s-mem;
       textFieldInput_1.setText(""+s);
    }
    
    else if(e.getSource() == MR){  
       String f=textFieldInput_1.getText();
       double s =eval(f);
       mem=s;
    }
          
   //plus_minus,C,CE,lnv,dms,base_10_pow,F_E,percent,y_redical_x;
    else if(e.getSource() == equal){      
        String f=textFieldInput_1.getText();
        double s =  eval(f);
        textFieldInput_1.setText(""+s);
        
    }  
       
    String k = textFieldInput_1.getText();
    textFieldInput_1.setText(k+input1);    
}
}