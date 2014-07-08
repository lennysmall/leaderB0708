package myWorkD;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class GameMain {
	int i,j,sum,cnt;
	JLabel[][] labelDefault;
	JLabel text1;
	JButton dice;
	Icon imgDefault = new ImageIcon("image/button.png");
	Icon imgBlue = new ImageIcon("image/button1.png");
	Icon imgRed = new ImageIcon("image/button2.png");
	Icon imgBomb = new ImageIcon("image/bomb.png");

	public void createGUI(){ 
		JFrame frameMain = new JFrame("GAME");	
		frameMain.setSize(710,700);
		frameMain.setResizable(false);

		JPanel panelMain = new JPanel();
		panelMain.setLayout(null);
		panelMain.setBackground(Color.BLACK);
		JLabel[][] labelBomb = new JLabel[5][5];
		JLabel[][] labelDefault = new JLabel[5][5];
		Font ft = new Font("ft", Font.CENTER_BASELINE,20);
		text1= new JLabel();
		text1.setBounds(100,505,50,50);
		text1.setFont(ft);
		text1.setForeground(Color.white);

		dice = new JButton("주사위");
		dice.setBounds(200,500,100,50);
		dice.addMouseListener(new MouseClick());

		// 기본바탕 25개 생성
		for ( i = 0; i < 5; i++) {
			for( j = 0; j<5; j++){
				labelDefault[i][j]=new JLabel(imgDefault);
				panelMain.add(labelDefault[i][j]);
				
				
			}
		}
		// 기본바탕 25개 크기 지정
		for ( i = 0; i < 5; i++) {
			for( j = 0; j<5; j++){
				labelDefault[i][j].setSize(100,100);
			}
		}
		//폭탄 25개 생성 및 기본레이블에 붙이기
		for ( i = 0; i < 5; i++) {
			for( j = 0; j<5; j++){
				labelBomb[i][j] = new JLabel(imgBomb);
				labelDefault[i][j].add(labelBomb[i][j]);
				labelBomb[i][j].setSize(100, 100);
			}
		}

		//폭탄숨기기
		for ( i = 0; i < 3; i++) {
			for( j = 0; j<5; j++){
				labelBomb[i][j].setVisible(false);	
			}
		}
		// 바탕좌표지정
		labelDefault[0][0].setLocation(0, 0);
		labelDefault[0][1].setLocation(100, 0);
		labelDefault[0][2].setLocation(200, 0);
		labelDefault[0][3].setLocation(300, 0);
		labelDefault[0][4].setLocation(400, 0);
		labelDefault[1][0].setLocation(0, 100);
		labelDefault[1][1].setLocation(100, 100);
		labelDefault[1][2].setLocation(200, 100);
		labelDefault[1][3].setLocation(300, 100);
		labelDefault[1][4].setLocation(400, 100);
		labelDefault[2][0].setLocation(0, 200);
		labelDefault[2][1].setLocation(100, 200);
		labelDefault[2][2].setLocation(200, 200);
		labelDefault[2][3].setLocation(300, 200);
		labelDefault[2][4].setLocation(400, 200);
		labelDefault[3][0].setLocation(0, 300);
		labelDefault[3][1].setLocation(100, 300);
		labelDefault[3][2].setLocation(200, 300);
		labelDefault[3][3].setLocation(300, 300);
		labelDefault[3][4].setLocation(400, 300);
		labelDefault[4][0].setLocation(0, 400);
		labelDefault[4][1].setLocation(100, 400);
		labelDefault[4][2].setLocation(200, 400);
		labelDefault[4][3].setLocation(300, 400);
		labelDefault[4][4].setLocation(400, 400);



		panelMain.add(dice);
		frameMain.add(panelMain);
		frameMain.setVisible(true);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	class MouseClick implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			try {
				labelDefault[0][1].setIcon(imgBlue);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {

		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			try {
				int a = (int)(Math.random()*6+1);
				sum += a;
				if(sum <= 25){
					if(sum==1){
						labelDefault[0][0].setIcon(imgBlue);
					}else if(sum==2){
						labelDefault[0][1].setIcon(imgBlue);
					}else if(sum==3){
						labelDefault[0][2].setIcon(imgBlue);
					}else if(sum==4){
						labelDefault[0][3].setIcon(imgBlue);
					}else if(sum==5){
						labelDefault[0][4].setIcon(imgBlue);
					}else if(sum==6){
						labelDefault[1][4].setIcon(imgBlue);
					}else if(sum==7){
						labelDefault[1][3].setIcon(imgBlue);
					}else if(sum==8){
						labelDefault[1][2].setIcon(imgBlue);
					}else if(sum==9){
						labelDefault[1][1].setIcon(imgBlue);
					}else if(sum==10){
						labelDefault[1][0].setIcon(imgBlue);
					}else if(sum==11){
						labelDefault[2][0].setIcon(imgBlue);
					}else if(sum==12){
						labelDefault[2][1].setIcon(imgBlue);
					}else if(sum==13){
						labelDefault[2][2].setIcon(imgBlue);
					}else if(sum==14){
						labelDefault[2][3].setIcon(imgBlue);
					}else if(sum==15){
						labelDefault[2][4].setIcon(imgBlue);
					}else if(sum==16){
						labelDefault[3][4].setIcon(imgBlue);
					}else if(sum==17){
						labelDefault[3][3].setIcon(imgBlue);
					}else if(sum==18){
						labelDefault[3][2].setIcon(imgBlue);
					}else if(sum==19){
						labelDefault[3][1].setIcon(imgBlue);
					}else if(sum==20){
						labelDefault[3][0].setIcon(imgBlue);
					}else if(sum==21){
						labelDefault[4][0].setIcon(imgBlue);
					}else if(sum==22){
						labelDefault[4][1].setIcon(imgBlue);
					}else if(sum==23){
						labelDefault[4][2].setIcon(imgBlue);;
					}else if(sum==24){
						labelDefault[4][3].setIcon(imgBlue);
					}else if(sum==25){
						labelDefault[4][4].setIcon(imgBlue);
					}
//					cnt++;
//					text1.setText(Integer.toString(cnt));
//				
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		}


		@Override
		public void mouseReleased(MouseEvent arg0) {

		}

	}

	public static void main(String[] args) {
		new GameMain().createGUI();
	}
}
