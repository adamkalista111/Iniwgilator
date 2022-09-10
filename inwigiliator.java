import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inwigilator {

    private JFrame frame;
    private JTextPane mainTytuł;
    private JTextField Sso_Field;
    private JTable table;
    private String[] split;
    private int x=0;
    private JButton InwigilujButton;
    private  int essa=0;

    /**
     * Launch the application.
     */


      public void szlip() { 

        while (true) {


            try {

                TimeUnit.MINUTES.sleep(5);
                x=0;
                InwigilujButton.doClick();;


            }
            catch(  Exception  e2) {    

            }



        }
    }   



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Inwigilator window = new Inwigilator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Inwigilator() {
        initialize();
        new Thread(this::szlip).start();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");  
           WebDriver driver=new ChromeDriver();
           driver.get("https://stars-emea.nsroot.net/prweb/SSOServlet/hzhP9HwhB2H6CmVkCOWsjQ%5B%5B*/!STANDARD");
           driver.manage().window().maximize();  
           WebDriverWait wait = new WebDriverWait(driver, 40);
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[2]/div/div/div/div/div/div/div/span/button/div/div/div/div")));
           driver.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[2]/div/div/div/div/div/div/div/span/button/div/div/div/div")).click();
           driver.manage().window().setPosition(new org.openqa.selenium.Point(1,1000));
           driver.manage().window().setSize(new org.openqa.selenium.Dimension(1920, 1080)); 


           try {
            TimeUnit.SECONDS.sleep(2);
             wait.until(ExpectedConditions.elementToBeClickable(By.id("Tab1")));
               driver.findElement(By.id("Tab1")).click();   

        } catch (InterruptedException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }


        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 153, 153));
        frame.setBounds(100, 100, 465, 592);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainTytuł = new JTextPane();
        mainTytuł.setEditable(false);
        mainTytuł.setBackground(new Color(0, 153, 153));
        mainTytuł.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 53));
        mainTytuł.setText("INWIGILATOR");

        Sso_Field = new JTextField();


        BufferedReader xd;
        try {
            xd = new BufferedReader(new FileReader(".\\Resources\\InwigilatorDane.txt"));
            String line = xd.readLine();
            Sso_Field.setText(line);

        }
        catch (Exception e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }




        Sso_Field.setColumns(10);

        JTextPane txt_instrukcja = new JTextPane();
        txt_instrukcja.setBackground(new Color(0, 153, 153));
        txt_instrukcja.setFont(new Font("Tahoma", Font.PLAIN, 23));
        txt_instrukcja.setText("       Podaj SSO rozdzielone przecinkami");

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBackground(Color.LIGHT_GRAY);

        InwigilujButton = new JButton("Inwigiluj");


        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(txt_instrukcja, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                        .addComponent(mainTytuł)
                        .addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                        .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                            .addComponent(Sso_Field, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(InwigilujButton, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addGap(13))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(16)
                    .addComponent(mainTytuł, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(txt_instrukcja, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(Sso_Field, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addComponent(InwigilujButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addContainerGap())
        );


        JTable table = new JTable(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "SSO", "ILOSC SPRAW"
            }
        )); 
        table.setFont(new Font("Tahoma", Font.PLAIN, 25));
        table.setRowHeight(40);     
        scrollPane.setViewportView(table);      
        frame.getContentPane().setLayout(groupLayout);

        InwigilujButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {                       


                       int count = Sso_Field.getText().length() - Sso_Field.getText().replace(",", "").length();

                        System.out.println(count);


                       do {
                        driver.switchTo().defaultContent();
                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[4]/div/div/div/div/div[1]/div[2]/div/div/span/a")));                                                                                 
                        driver.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[4]/div/div/div/div/div[1]/div[2]/div/div/span/a")).click();  
                        TimeUnit.SECONDS.sleep(1);
                        driver.switchTo().frame("PegaGadget0Ifr");


                       String SSO = Sso_Field.getText();
                        split = SSO.split(",",-1);



                        TimeUnit.SECONDS.sleep(1);
                       wait.until(ExpectedConditions.elementToBeClickable(By.id("Operator")));



                        driver.findElement(By.id("Operator")).sendKeys(split[x]);;  
                       x++;

                       wait.until(ExpectedConditions.elementToBeClickable(By.className("buttonTdButton")));
                        driver.findElement(By.className("buttonTdButton")).click();


                        driver.switchTo().frame("theDiv1");
                        //ak22108,js27980


                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table/tbody/tr/td/div/div/table[1]/tbody/tr/td[1]/div/span")));                   
                        String Dane = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/div/table[1]/tbody/tr/td[1]/div/span")).getText();

                        String imie = Dane.substring(17, 24);
                        String iloscspraw = Dane.substring(35, 36);

                        System.out.println(imie);
                        System.out.println(iloscspraw);


                        driver.switchTo().defaultContent();


                        wait.until(ExpectedConditions.elementToBeClickable(By.id("close")));
                           driver.findElement(By.id("close")).click();  
                           driver.switchTo().defaultContent();

                            DefaultTableModel model = (DefaultTableModel) table.getModel(); 




                            model.insertRow(0, new Object[]{imie, iloscspraw});


                            if(model.getRowCount() > count +1 ) {
                            model.removeRow(model.getRowCount() - 1); 
                            }
                       }
                    while(x<=count);

                      x=0; 

                }







                      catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        });



    }

}