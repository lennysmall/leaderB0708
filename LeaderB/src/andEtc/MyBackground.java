package andEtc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

class MyBackground {
	JLabel toTalScoreBlue,toTalScoreRed,playerBlue,comRed,labelPlate1,labelPlate2,labelPlate3,labelPlate4,labelPlate5,labelPlate6,labelPlate7,labelPlate8,labelPlate9,labelPlate10,labelPlate11,labelPlate12,labelPlate13,labelPlate14,labelPlate15,labelPlate16,labelPlate17,labelPlate18,labelPlate19,labelPlate20,labelPlate21,labelPlate22,labelPlate23,labelPlate24,labelPlate25;
	JButton btnDice;
	int sum = 0, num = 0,count = 0,count1 = 0;
	Icon colorDefault = new ImageIcon("image/button.png"),colorBlue = new ImageIcon("image/button1.png"),colorRed = new ImageIcon("image/button2.png");
	ArrayList<JLabel> listPlate;
	
	public MyBackground(){
		
		// 게임진행 버튼
		btnDice = new JButton("주사위");
		btnDice.setBounds(200,500,100,50);
		btnDice.addMouseListener(new MouseClick());
		
		// 폰트 생성
		Font fontShowWho = new Font("@휴먼둥근헤드라인", Font.CENTER_BASELINE,20);
		Font fontScore = new Font("@휴먼둥근헤드라인", Font.CENTER_BASELINE,40);

		// 사용자와 컴퓨터 이름
		playerBlue = new JLabel("MAN :");
		comRed = new JLabel("COM :");
		
		playerBlue.setFont(fontShowWho);
		comRed.setFont(fontShowWho);
		
		playerBlue.setForeground(Color.white);
		comRed.setForeground(Color.white);
				
		playerBlue.setBounds(20,480,100,100);
		comRed.setBounds(370,480,100,100);

		// 점수
		toTalScoreBlue= new JLabel();
		toTalScoreRed= new JLabel();
		
		toTalScoreBlue.setFont(fontScore);
		toTalScoreRed.setFont(fontScore);
		
		toTalScoreBlue.setForeground(Color.white);
		toTalScoreRed.setForeground(Color.white);
		
		toTalScoreBlue.setBounds(100,505,50,50);
		toTalScoreRed.setBounds(445,505,50,50);
		
		//게임 판생성
		labelPlate1 = new JLabel(colorDefault);
		labelPlate2 = new JLabel(colorDefault);
		labelPlate3 = new JLabel(colorDefault);
		labelPlate4 = new JLabel(colorDefault);
		labelPlate5 = new JLabel(colorDefault);
		labelPlate6 = new JLabel(colorDefault);
		labelPlate7 = new JLabel(colorDefault);		
		labelPlate7 = new JLabel(colorDefault);
		labelPlate8 = new JLabel(colorDefault);
		labelPlate9 = new JLabel(colorDefault);
		labelPlate10 = new JLabel(colorDefault);
		labelPlate11 = new JLabel(colorDefault);
		labelPlate12 = new JLabel(colorDefault);
		labelPlate13 = new JLabel(colorDefault);
		labelPlate14 = new JLabel(colorDefault);		
		labelPlate15 = new JLabel(colorDefault);
		labelPlate16 = new JLabel(colorDefault);
		labelPlate17 = new JLabel(colorDefault);
		labelPlate18 = new JLabel(colorDefault);
		labelPlate19 = new JLabel(colorDefault);
		labelPlate20 = new JLabel(colorDefault);
		labelPlate21 = new JLabel(colorDefault);
		labelPlate22 = new JLabel(colorDefault);
		labelPlate23 = new JLabel(colorDefault);
		labelPlate24 = new JLabel(colorDefault);
		labelPlate25 = new JLabel(colorDefault);
		
		//게임판 배치
		labelPlate1.setBounds(0,0,100,100);
		labelPlate2.setBounds(100,0,100,100);
		labelPlate3.setBounds(200,0,100,100);
		labelPlate4.setBounds(300,0,100,100);
		labelPlate5.setBounds(400,0,100,100);
		labelPlate6.setBounds(400,100,100,100);
		labelPlate7.setBounds(300,100,100,100);
		labelPlate8.setBounds(200,100,100,100);
		labelPlate9.setBounds(100,100,100,100);
		labelPlate10.setBounds(0,100,100,100);
		labelPlate11.setBounds(0,200,100,100);
		labelPlate12.setBounds(100,200,100,100);
		labelPlate13.setBounds(200,200,100,100);
		labelPlate14.setBounds(300,200,100,100);
		labelPlate15.setBounds(400,200,100,100);
		labelPlate16.setBounds(400,300,100,100);
		labelPlate17.setBounds(300,300,100,100);
		labelPlate18.setBounds(200,300,100,100);
		labelPlate19.setBounds(100,300,100,100);
		labelPlate20.setBounds(0,300,100,100);
		labelPlate21.setBounds(0,400,100,100);
		labelPlate22.setBounds(100,400,100,100);
		labelPlate23.setBounds(200,400,100,100);
		labelPlate24.setBounds(300,400,100,100);
		labelPlate25.setBounds(400,400,100,100);
		
		ArrayList<JLabel> listPlate = new ArrayList<JLabel>();
		listPlate.add(labelPlate1);
		listPlate.add(labelPlate2);
		listPlate.add(labelPlate3);
		listPlate.add(labelPlate4);
		listPlate.add(labelPlate5);
		listPlate.add(labelPlate6);
		listPlate.add(labelPlate7);
		listPlate.add(labelPlate8);
		listPlate.add(labelPlate9);
		listPlate.add(labelPlate10);
		listPlate.add(labelPlate11);
		listPlate.add(labelPlate12);
		listPlate.add(labelPlate13);
		listPlate.add(labelPlate14);
		listPlate.add(labelPlate15);
		listPlate.add(labelPlate16);
		listPlate.add(labelPlate17);
		listPlate.add(labelPlate18);
		listPlate.add(labelPlate19);
		listPlate.add(labelPlate20);
		listPlate.add(labelPlate21);
		listPlate.add(labelPlate22);
		listPlate.add(labelPlate23);
		listPlate.add(labelPlate24);
		listPlate.add(labelPlate25);
	}
	
	// 색상변경을 위한 마우스 리스너 시작
	class MouseClick implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {

			int rndOne = (int)(Math.random()*6+1);
			sum += rndOne;
			if(sum <= 25){
//				for(int i = 0; i < listPlate.size(); i++) {
//					if(sum==i){
//						listPlate.get(i).setIcon(colorBlue);}
//					
//					
//				}
				if(sum==1){
					labelPlate1.setIcon(colorBlue);
				}else if(sum==2){
					labelPlate2.setIcon(colorBlue);
				}else if(sum==3){
					labelPlate3.setIcon(colorBlue);
				}else if(sum==4){
					labelPlate4.setIcon(colorBlue);
				}else if(sum==5){
					labelPlate5.setIcon(colorBlue);
				}else if(sum==6){
					labelPlate6.setIcon(colorBlue);
				}else if(sum==7){
					labelPlate7.setIcon(colorBlue);
				}else if(sum==8){
					labelPlate8.setIcon(colorBlue);
				}else if(sum==9){
					labelPlate9.setIcon(colorBlue);
				}else if(sum==10){
					labelPlate10.setIcon(colorBlue);
				}else if(sum==11){
					labelPlate11.setIcon(colorBlue);
				}else if(sum==12){
					labelPlate12.setIcon(colorBlue);
				}else if(sum==13){
					labelPlate13.setIcon(colorBlue);
				}else if(sum==14){
					labelPlate14.setIcon(colorBlue);
				}else if(sum==15){
					labelPlate15.setIcon(colorBlue);
				}else if(sum==16){
					labelPlate16.setIcon(colorBlue);
				}else if(sum==17){
					labelPlate17.setIcon(colorBlue);
				}else if(sum==18){
					labelPlate18.setIcon(colorBlue);
				}else if(sum==19){
					labelPlate19.setIcon(colorBlue);
				}else if(sum==20){
					labelPlate20.setIcon(colorBlue);
				}else if(sum==21){
					labelPlate21.setIcon(colorBlue);
				}else if(sum==22){
					labelPlate22.setIcon(colorBlue);
				}else if(sum==23){
					labelPlate23.setIcon(colorBlue);;
				}else if(sum==24){
					labelPlate24.setIcon(colorBlue);
				}else if(sum==25){
					labelPlate25.setIcon(colorBlue);
				}
				count++;
				toTalScoreBlue.setText(Integer.toString(count));
			}
		}

		
		@Override
		public void mouseReleased(MouseEvent e) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int rndTwo = (int)(Math.random()*6+1);
			num += rndTwo;
			if(num<=25){
				if(num==1){
					labelPlate25.setIcon(colorRed);
				}else if(num==2){
					labelPlate24.setIcon(colorRed);
				}else if(num==3){
					labelPlate23.setIcon(colorRed);
				}else if(num==4){
					labelPlate22.setIcon(colorRed);
				}else if(num==5){
					labelPlate21.setIcon(colorRed);
				}else if(num==6){
					labelPlate20.setIcon(colorRed);
				}else if(num==7){
					labelPlate19.setIcon(colorRed);
				}else if(num==8){
					labelPlate18.setIcon(colorRed);
				}else if(num==9){
					labelPlate17.setIcon(colorRed);
				}else if(num==10){
					labelPlate16.setIcon(colorRed);
				}else if(num==11){
					labelPlate15.setIcon(colorRed);
				}else if(num==12){
					labelPlate14.setIcon(colorRed);
				}else if(num==13){
					labelPlate13.setIcon(colorRed);
				}else if(num==14){
					labelPlate12.setIcon(colorRed);
				}else if(num==15){
					labelPlate11.setIcon(colorRed);
				}else if(num==16){
					labelPlate10.setIcon(colorRed);
				}else if(num==17){
					labelPlate9.setIcon(colorRed);
				}else if(num==18){
					labelPlate8.setIcon(colorRed);
				}else if(num==19){
					labelPlate7.setIcon(colorRed);
				}else if(num==20){
					labelPlate6.setIcon(colorRed);
				}else if(num==21){
					labelPlate5.setIcon(colorRed);
				}else if(num==22){
					labelPlate4.setIcon(colorRed);
				}else if(num==23){
					labelPlate3.setIcon(colorRed);
				}else if(num==24){
					labelPlate2.setIcon(colorRed);
				}else if(num==25){
					labelPlate1.setIcon(colorRed);
				}
				count1++;
				toTalScoreRed.setText(Integer.toString(count1));
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
	}
}
