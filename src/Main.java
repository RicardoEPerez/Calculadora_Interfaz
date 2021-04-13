
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Ricardo
 */
public class Main extends JFrame implements ActionListener {

    private JLabel eti1, eti2, eti3;
    private JButton bot1, bot2, bot3, bot4;
    private JTextField txt1, txt2, txt3;
    private int a, b, r;
    private String r2;

    public Main() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("La besto Calcculapobre");

        //Etiquetas
        eti1 = new JLabel("Primer numero");
        eti1.setBounds(10, 10, 100, 30);
        add(eti1);

        eti2 = new JLabel("Segundo numero");
        eti2.setBounds(120, 10, 100, 30);
        add(eti2);

        eti3 = new JLabel("Resultado");
        eti3.setBounds(230, 10, 100, 30);
        add(eti3);

        //Botones
        bot1 = new JButton("+");//suma
        bot1.setBounds(10, 90, 50, 30);
        add(bot1);
        bot1.addActionListener(this);

        bot2 = new JButton("-");//resta
        bot2.setBounds(70, 90, 50, 30);
        add(bot2);
        bot2.addActionListener(this);

        bot3 = new JButton("*");//multipicacion
        bot3.setBounds(130, 90, 50, 30);
        add(bot3);
        bot3.addActionListener(this);;

        bot4 = new JButton("/");//divicion
        bot4.setBounds(190, 90, 50, 30);
        add(bot4);
        bot4.addActionListener(this);;

        //Cuador de texto
        txt1 = new JTextField();//no 1
        txt1.setBounds(10, 50, 100, 30);
        add(txt1);

        txt2 = new JTextField();//no 2
        txt2.setBounds(120, 50, 100, 30);
        add(txt2);

        txt3 = new JTextField();// no3
        txt3.setBounds(230, 50, 100, 30);
        add(txt3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bot1) {
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            r = a + b;
            r2 = Integer.toString(r);
            txt3.setText(r2);
        }
        if (e.getSource() == bot2) {
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            r = a - b;
            r2 = Integer.toString(r);
            txt3.setText(r2);
        }
        if (e.getSource() == bot3) {
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            r = a * b;
            r2 = Integer.toString(r);
            txt3.setText(r2);
        }
        if (e.getSource() == bot4) {
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            r = a / b;
            r2 = Integer.toString(r);
            txt3.setText(r2);
        }
    }

    public static void main(String args[]) {
        //Ventana de windowa
        Main exa1 = new Main();
        exa1.setBounds(0, 0, 400, 350);//Medida y pocision
        exa1.setVisible(true);//Visible o no
        exa1.setLocationRelativeTo(null);//Esto es para que aparecesca en el centro de la pantalla 
        exa1.setResizable(false);//Modificador de ventana por usuario final
    }
}
