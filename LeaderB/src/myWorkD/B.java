package myWorkD;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class B {
	int i,j;
	JLabel mainPanel;
	ImageIcon panelBasic,panelBlue,panelRed,bomb;
	JButton btnStart,btn;
//	JLabel[][] labelBasic;
	JLabel labelBasic;
	JButton[][] btnbomb;
	int sum=0;
	public void createGUI(){
		JFrame mainFrame = new JFrame("GAME");	
		mainFrame.setSize(510,600);
		//		mainFrame.setResizable(false);

		panelBasic = new ImageIcon("image/button.png");
		panelBlue = new ImageIcon("image/button1.png");
		panelRed = new ImageIcon("image/button2.png");
		bomb = new ImageIcon("image/bomb.png");
		JPanel mainPanel = new JPanel();
		JLabel[][] labelBasic = new JLabel[5][5];
		JButton[][] btnbomb = new JButton[5][5];
		btn = new JButton();
		mainPanel.setLayout(null);

		
		for ( i = 0; i < 5; i++) {
			for( j = 0; j<5; j++){
				for(int x = 0; x<=400; x+=100){					
					for(int y = 0; y<=400; y+=100){
						labelBasic[i][j]=new JLabel(panelBasic);
						labelBasic[i][j].setBounds(x,y,100,100);
						mainPanel.add(labelBasic[i][j]);
//						btnbomb[i][j] = new JButton(bomb);
//						labelBasic[i][j].add(btnbomb[i][j]);
//						btnbomb[i][j].setBounds(19, 19, 60, 60);
					}
				}
			}
		}
		for(int i = 0 ; i < labelBasic.length ;i ++){
			for(int j = 0 ; j < labelBasic.length; j++){
				labelBasic[0][0].setIcon(panelBlue);
				labelBasic[1][0].setIcon(panelBlue);
				labelBasic[1][1].setIcon(panelBlue);
				labelBasic[2][0].setIcon(panelBlue);
				labelBasic[2][2].setIcon(panelBlue);
				labelBasic[2][3].setIcon(panelBlue);
				labelBasic[2][4].setIcon(panelBlue);
				labelBasic[3][0].setIcon(panelBlue);
				labelBasic[4][0].setIcon(panelBlue);
								
			}
		}
		
		
		
		
		
		
		
		
		JButton btnStart = new JButton("시작");
		btnStart.setBounds(220, 480, 80, 80);
		mainPanel.add(btnStart);
		btnStart.addMouseListener(new MouseClick());
		mainFrame.add(mainPanel);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	class MouseClick implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
//			JButton button = (JButton)e.getSource();
//			if(button.equals(btnStart)){
//				int a = (int)(Math.random()*6+1);
//				sum += a;
//				if(sum <= 25){
//					if(sum==1){
//						labelBasic[0][0].setIcon(panelBlue);
//					}else if(sum==2){
//						labelBasic[0][1].setIcon(panelBlue);
//					}else if(sum==3){
//						labelBasic[0][2].setIcon(panelBlue);
//					}else if(sum==4){
//						labelBasic[0][3].setIcon(panelBlue);
//					}else if(sum==5){
//						labelBasic[0][4].setIcon(panelBlue);
//					}else if(sum==6){
//						labelBasic[1][4].setIcon(panelBlue);
//					}
//					else if(sum==7){
//						labelBasic[1][3].setIcon(panelBlue);
//					}
//					else if(sum==8){
//						labelBasic[1][2].setIcon(panelBlue);
//					}
//					else if(sum==9){
//						labelBasic[1][1].setIcon(panelBlue);
//					}
//					else if(sum==10){
//						labelBasic[1][0].setIcon(panelBlue);
//					}
//					
//				}
//			}			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}


	public static void main(String[] args) {
		new B().createGUI();
	}


}
