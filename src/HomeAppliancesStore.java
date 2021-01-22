import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.awt.event.*;

public class HomeAppliancesStore {

    static int i;
    static String onomaEterias;
    static String diefthinsi;
    static int plithosYpalilwn;

    public static void setOnomaEterias(String onoma){
        onomaEterias=onoma;
    }
    public static void setDiefthinsi(String dief){
        diefthinsi=dief;
    }
    public static void setPlithosYpalilwn(int plithos) {
        plithosYpalilwn = plithos;
    }

    public static String getOnomaEterias(){
        return onomaEterias;
    }


    public static String getDiefthinsi(){
        return diefthinsi;
    }


    public static int getPlithosYpalilwn(){
        return plithosYpalilwn;
    }






    public static void main(String [] args) {


JFrame jfr = new JFrame();
JFrame jf = new JFrame();


JLabel Ovens = new JLabel("\nFournoi :");
JTextField field1 = new JTextField(20);
    jfr.add(Ovens);
    jfr.add(field1);

JLabel ACs = new JLabel("\nKlimatistika :");
JTextField field2 = new JTextField(20);
        jfr.add(ACs);
        jfr.add(field2);


JLabel WMs = new JLabel("\nPlintiria :");
JTextField field3 = new JTextField(20);
        jfr.add(WMs);
        jfr.add(field3);

JLabel Fridges = new JLabel("\n Psigia :");
JTextField field4 = new JTextField(20);
        jfr.add(Fridges);
        jfr.add(field4);

        JButton button = new JButton("\n ypovoli");
        button.setBounds(200, 375, 50, 50);
        jfr.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int oc = 0;
                int acc = 0;
                int wmc = 0;
                int fc = 0;

                oc = Integer.parseInt(field1.getText());
                acc = Integer.parseInt(field2.getText());
                wmc = Integer.parseInt(field3.getText());
                fc = Integer.parseInt(field4.getText());

                Oven ovena[] = new Oven[oc];
                for (int i = 0; i <= oc-1; i++) {
                    ovena[i] = new Oven();
                }


                AirCondition aca[] = new AirCondition[acc];
                for (int i = 0; i <= acc-1; i++) {
                    aca[i] = new AirCondition();
                }


                WashineMachine wma[] = new WashineMachine[wmc];
                for (int i = 0; i <= wmc-1; i++) {
                    wma[i] = new WashineMachine();
                }


                Fridge fridgea[] = new Fridge[fc];
                for (int i = 0; i <= fc-1; i++) {
                    fridgea[i] = new Fridge();
                }

                JOptionPane.showMessageDialog(null," \nfournoi : "+ oc + "\n klimatistika : "+ acc + "\n plintiria : "+ wmc + "\n psigia : "+ fc);
                JTextArea tarea=new JTextArea();
                tarea.setBounds(15,15, 250,250);
                tarea.setForeground(Color.CYAN);
                jfr.add(tarea);
                jfr.setVisible(false);
                jf.setVisible(true);





            }
        });


        jfr.add(button);
        jfr.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setSize(400,400);
        jfr.setLocationRelativeTo(null);
        jfr.setVisible(true);


        jf.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(350,350);
        jf.setLocationRelativeTo(null);
        jf.setVisible(false);
    }






}

