package andEtc;

import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;

class MyBomb {
	Icon bomb = new ImageIcon("image/bomb.png");
	JLabel labelBomb1,labelBomb2,labelBomb3,labelBomb4,labelBomb5,labelBomb6,labelBomb7,labelBomb8,labelBomb9,labelBomb10,labelBomb11,labelBomb12,labelBomb13,labelBomb14,labelBomb15,labelBomb16,labelBomb17,labelBomb18,labelBomb19,labelBomb20,labelBomb21,labelBomb22,labelBomb23,labelBomb24,labelBomb25;

	
	public MyBomb(){
		
		//폭탄 레이블 생성
		labelBomb1 = new JLabel(bomb);
		labelBomb2 = new JLabel(bomb);
		labelBomb3 = new JLabel(bomb);
		labelBomb4 = new JLabel(bomb);
		labelBomb5 = new JLabel(bomb);
		labelBomb6 = new JLabel(bomb);
		labelBomb7 = new JLabel(bomb);
		labelBomb8 = new JLabel(bomb);
		labelBomb9 = new JLabel(bomb);
		labelBomb10 = new JLabel(bomb);
		labelBomb11 = new JLabel(bomb);
		labelBomb12 = new JLabel(bomb);
		labelBomb13 = new JLabel(bomb);
		labelBomb14 = new JLabel(bomb);
		labelBomb15 = new JLabel(bomb);
		labelBomb16 = new JLabel(bomb);
		labelBomb17 = new JLabel(bomb);
		labelBomb18 = new JLabel(bomb);
		labelBomb19 = new JLabel(bomb);
		labelBomb20 = new JLabel(bomb);
		labelBomb21 = new JLabel(bomb);
		labelBomb22 = new JLabel(bomb);
		labelBomb23 = new JLabel(bomb);
		labelBomb24 = new JLabel(bomb);
		labelBomb25 = new JLabel(bomb);
		
		//폭탄 절대값 위치지정
		labelBomb1.setBounds(0,0,100,100);
		labelBomb2.setBounds(100,0,100,100);	
		labelBomb3.setBounds(200,0,100,100);	
		labelBomb4.setBounds(300,0,100,100);	
		labelBomb5.setBounds(400,0,100,100);
		labelBomb6.setBounds(400,100,100,100);	
		labelBomb7.setBounds(300,100,100,100);	
		labelBomb8.setBounds(200,100,100,100);	
		labelBomb9.setBounds(100,100,100,100);	
		labelBomb10.setBounds(0,100,100,100);	
		labelBomb11.setBounds(0,200,100,100);	
		labelBomb12.setBounds(100,200,100,100);	
		labelBomb13.setBounds(200,200,100,100);	
		labelBomb14.setBounds(300,200,100,100);	
		labelBomb15.setBounds(400,200,100,100);	
		labelBomb16.setBounds(400,300,100,100);	
		labelBomb17.setBounds(300,300,100,100);	
		labelBomb18.setBounds(200,300,100,100);	
		labelBomb19.setBounds(100,300,100,100);	
		labelBomb20.setBounds(0,300,100,100);	
		labelBomb21.setBounds(0,400,100,100);	
		labelBomb22.setBounds(100,400,100,100);	
		labelBomb23.setBounds(200,400,100,100);	
		labelBomb24.setBounds(300,400,100,100);	
		labelBomb25.setBounds(400,400,100,100);	
		
		//배열에 담는다
		ArrayList<JLabel> listBomb = new ArrayList<JLabel>();
		listBomb.add(labelBomb1);
		listBomb.add(labelBomb2);
		listBomb.add(labelBomb3);
		listBomb.add(labelBomb4);
		listBomb.add(labelBomb5);
		listBomb.add(labelBomb6);
		listBomb.add(labelBomb7);
		listBomb.add(labelBomb8);
		listBomb.add(labelBomb9);
		listBomb.add(labelBomb10);
		listBomb.add(labelBomb11);
		listBomb.add(labelBomb12);
		listBomb.add(labelBomb13);
		listBomb.add(labelBomb14);
		listBomb.add(labelBomb15);
		listBomb.add(labelBomb16);
		listBomb.add(labelBomb17);
		listBomb.add(labelBomb18);
		listBomb.add(labelBomb19);
		listBomb.add(labelBomb20);
		listBomb.add(labelBomb21);
		listBomb.add(labelBomb22);
		listBomb.add(labelBomb23);
		listBomb.add(labelBomb24);
		listBomb.add(labelBomb25);

		//폭탄숨기기 전체
//		for(int i = 0; i < listBomb.size(); i++) {
//			listBomb.get(i).setVisible(false);
//		}
		for(int i = 0; i < 8; i++) {
			listBomb.get(i).setVisible(false);
		}
	}
}
