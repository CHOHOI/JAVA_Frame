package Frame_Pro;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class FrameTest01 {

   public static void main(String[] args) {
      
//      Frame frame = new Frame("ù ������");
//      frame.setBounds(800,100,400,300); // (x��ǥ y��ǥ �ʺ� ����)
//      
//      frame.setVisible(true);
//      frame.setBackground(Color.blue);
//      frame.setLocationRelativeTo(null);
      
//      Frame frame = new Frame("����");
//      Button[] arbtn = new Button[5];
//      
//      String[] btnTitles = {"close","����","���","Ȯ��","�ȳ�"};
//      
//      for(int i = 0; i<arbtn.length; i++) {
//         arbtn[i] = new Button(btnTitles[i]);
//         
//      }
//      frame.add(arbtn[0],BorderLayout.EAST);
//      frame.add(arbtn[1],BorderLayout.WEST);
//      frame.add(arbtn[2],BorderLayout.SOUTH);
//      frame.add(arbtn[3],BorderLayout.NORTH);
//      frame.add(arbtn[4],BorderLayout.CENTER);
//      
//      // �����ӿ� ���빰�� ������ �� ���� ��ŭ ������ Ȯ��
//      
//      frame.pack();
//      
//      frame.setVisible(true);
      
      Frame frame = new Frame("����dlekdkdkdk");
      Button[] arbtn = new Button[5];
      
      String[] btnTitles = {"�ݱ�","����","���","Ȯ��","�ȳ�"};
      
      for(int i = 0; i<arbtn.length; i++) {
         arbtn[i] = new Button(btnTitles[i]);
         
      }
      frame.add(arbtn[0],BorderLayout.EAST);
      frame.add(arbtn[1],BorderLayout.WEST);
      frame.add(arbtn[2],BorderLayout.SOUTH);
      frame.add(arbtn[3],BorderLayout.NORTH);
      frame.add(arbtn[4],BorderLayout.CENTER);
      
      // �����ӿ� ���빰�� ������ �� ���� ��ŭ ������ Ȯ��
      
      frame.pack();
      
      frame.setVisible(true);
      
      // ���ʿ� ��ġ�� �ݱ� ��ư
      arbtn[0].addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
            
         }
      });
      
      // X��ư ������
      
      frame.addWindowListener(new WindowAdapter() {
      
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      
      
   }
}