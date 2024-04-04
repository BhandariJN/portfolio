import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
class login {
JFrame f = new JFrame(
JLabel l = new JLabel("Username");
JLabel l1 = new JLabel("Password");
JTextField t = new JTextField(10);
JTextField t1 = new JTextField(10);
JButton b = new JButton("Login");
JButton b1 = new JButton("Signup");
f.add(l);
f.add(t);
f.add(l1);
f.add(t1);
f.add(b);
f.add(b1);
l.setBounds(10,20,80,25);
t.setBounds(100,20,165,25);
l1.setBounds(10,50,80,25);
t1.setBounds(100,50,165,25);
b.setBounds(10,80,80,25);
b1.setBounds(10,110,80,25);
f.setSize(300,300);
f.setVisible(true);

}
class Main {
    public static void main(String[] args) {
        new login();
    }
}