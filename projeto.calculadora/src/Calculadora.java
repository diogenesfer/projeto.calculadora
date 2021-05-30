import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*


Nome: Diogenes Ferreira da Silva
RA: 00105528


 */

public class Calculadora {
    private static String textodisplay;
    private static String limpardisplay = null;
    private static double primeironumero;
    private static double segundonumero;
    private static double resultado;
    private static String operacao;
    private static String responder;



    public static void main(String[] args) {


        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        JFrame tela = new JFrame();
        tela.setSize(240, 375);


        final int[] leitura = new int[1];


        JTextField display = new JTextField();
        display.setBounds(10,11,207,50);
        display.setEditable(false);
        display.setFont(new Font("Tahoma", Font.BOLD, 20));
        display.setHorizontalAlignment(display.RIGHT);

        // Linha 1

        JButton bclear = new JButton("CE");
        bclear.setBounds(10,65,102,50);
        bclear.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton blimpar = new JButton("c");
        blimpar.setBounds(114,65,50,50);
        blimpar.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton bdiv= new JButton("÷");
        bdiv.setBounds(166,65,50,50);
        bdiv.setFont(new Font("Tahoma", Font.BOLD, 20));

        // Linha 2

        JButton b7 = new JButton("7");
        b7.setBounds(10,118,50,50);
        b7.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton b8 = new JButton("8");
        b8.setBounds(62,118,50,50);
        b8.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton b9 = new JButton("9");
        b9.setBounds(114,118,50,50);
        b9.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton bmenos = new JButton("-");
        bmenos.setBounds(166,118,50,50);
        bmenos.setFont(new Font("Tahoma", Font.BOLD, 20));

        // Linha 3

        JButton b4 = new JButton("4");
        b4.setBounds(10,171,50,50);
        b4.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton b5 = new JButton("5");
        b5.setBounds(62,171,50,50);
        b5.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton b6 = new JButton("6");
        b6.setBounds(114,171,50,50);
        b6.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton bmais = new JButton("+");
        bmais.setBounds(166,171,50,50);
        bmais.setFont(new Font("Tahoma", Font.BOLD, 20));

        // Linha 4

        JButton b1 = new JButton("1");
        b1.setBounds(10,224,50,50);
        b1.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton b2 = new JButton("2");
        b2.setBounds(62,224,50,50);
        b2.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton b3 = new JButton("3");
        b3.setBounds(114,224,50,50);
        b3.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton bvezes = new JButton("X");
        bvezes.setBounds(166,224,50,50);
        bvezes.setFont(new Font("Tahoma", Font.BOLD, 20));

        // Linha 5

        JButton b0 = new JButton("0");
        b0.setBounds(10,277,102,50);
        b0.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton bvirg = new JButton(",");
        bvirg.setBounds(114,277,50,50);
        bvirg.setFont(new Font("Tahoma", Font.BOLD, 20));

        JButton bigual = new JButton("=");
        bigual.setBounds(166,277,50,50);
        bigual.setFont(new Font("Tahoma", Font.BOLD, 20));



        JPanel painel = new JPanel();
        painel.setLayout(null);

        painel.add(display);
        painel.add(bclear);
        painel.add(blimpar);
        painel.add(bdiv);
        painel.add(b7);
        painel.add(b8);
        painel.add(b9);
        painel.add(bmenos);
        painel.add(b4);
        painel.add(b5);
        painel.add(b6);
        painel.add(bmais);
        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        painel.add(bvezes);
        painel.add(b0);
        painel.add(bvirg);
        painel.add(bigual);

        // Funcoes

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 7;
                display.setText(display.getText() + "7");
            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 8;
                display.setText(display.getText() + "8");
            }
        });

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 9;
                display.setText(display.getText() + "9");
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 4;
                display.setText(display.getText() + "4");
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 5;
                display.setText(display.getText() + "5");
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 6;
                display.setText(display.getText() + "6");
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 1;
                display.setText(display.getText() + "1");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 2;
                display.setText(display.getText() + "2");
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 3;
                display.setText(display.getText() + "3");
            }
        });

        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura[0] *= 10;
                leitura[0] += 0;
                display.setText(display.getText() + "0");
            }
        });

        bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textodisplay = "";
                display.setText(textodisplay);
            }
        });

        blimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder apagar = new StringBuilder(display.getText());
                apagar.deleteCharAt(display.getText().length() -1);
                limpardisplay = apagar.toString();
                display.setText((limpardisplay));
            }
        });

        bmais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeironumero = Double.parseDouble(display.getText());
                display.setText("");
                operacao = "+";
            }
        });

        bvezes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeironumero = Double.parseDouble(display.getText());
                display.setText("");
                operacao = "*";
            }
        });

        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeironumero = Double.parseDouble(display.getText());
                display.setText("");
                operacao = "/";
            }
        });

        bmenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeironumero = Double.parseDouble(display.getText());
                display.setText("");
                operacao = "-";
            }
        });

        bvirg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + ".");
            }
        });

        bigual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String responder;
                segundonumero = Double.parseDouble(display.getText());
                if (operacao == "+"){

                    resultado = primeironumero + segundonumero;
                    responder = String.format("%.2f",resultado);
                    display.setText(String.valueOf(resultado));
                }
                else if (operacao == "-"){
                    resultado = primeironumero - segundonumero;
                    responder = String.format("%.2f",resultado);
                    display.setText(responder);
                }

                else if (operacao == "/"){
                    resultado = primeironumero / segundonumero;
                    responder = String.format("%.2f",resultado);
                    display.setText(responder);
                }

                else if (operacao == "*"){
                    resultado = primeironumero * segundonumero;
                    responder = String.format("%.2f",resultado);
                    display.setText(responder);
                }


            }
        });




        tela.setVisible(true);
        tela.getContentPane().add(painel);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}