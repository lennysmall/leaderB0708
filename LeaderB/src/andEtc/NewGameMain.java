package andEtc;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewGameMain {
	JPanel mainPanel; 
	
	public void createGUI(){ 
		//클래스 연결
		MyBomb classMyBomb = new MyBomb();
		MyBackground classMyBackground = new MyBackground();
		
		//프레임 및 패널 생성
		JFrame mainFrame = new JFrame("GAME");	
		
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.darkGray);
		
		mainFrame.setSize(510,600);
		mainFrame.setResizable(false);
		mainFrame.add(mainPanel);
		
		
		//패널에 게임판과 폭탄을 붙여넣는다
		mainPanel.add(classMyBomb.labelBomb1);
		mainPanel.add(classMyBomb.labelBomb2);
		mainPanel.add(classMyBomb.labelBomb3);
		mainPanel.add(classMyBomb.labelBomb4);
		mainPanel.add(classMyBomb.labelBomb5);
		mainPanel.add(classMyBomb.labelBomb10);
		mainPanel.add(classMyBomb.labelBomb9);
		mainPanel.add(classMyBomb.labelBomb8);
		mainPanel.add(classMyBomb.labelBomb7);
		mainPanel.add(classMyBomb.labelBomb6);
		mainPanel.add(classMyBomb.labelBomb11);
		mainPanel.add(classMyBomb.labelBomb12);
		mainPanel.add(classMyBomb.labelBomb13);
		mainPanel.add(classMyBomb.labelBomb14);
		mainPanel.add(classMyBomb.labelBomb15);
		mainPanel.add(classMyBomb.labelBomb20);
		mainPanel.add(classMyBomb.labelBomb19);
		mainPanel.add(classMyBomb.labelBomb18);
		mainPanel.add(classMyBomb.labelBomb17);
		mainPanel.add(classMyBomb.labelBomb16);
		mainPanel.add(classMyBomb.labelBomb21);
		mainPanel.add(classMyBomb.labelBomb22);
		mainPanel.add(classMyBomb.labelBomb23);
		mainPanel.add(classMyBomb.labelBomb24);
		mainPanel.add(classMyBomb.labelBomb25);

		mainPanel.add(classMyBackground.labelPlate1);
		mainPanel.add(classMyBackground.labelPlate2);
		mainPanel.add(classMyBackground.labelPlate3);
		mainPanel.add(classMyBackground.labelPlate4);
		mainPanel.add(classMyBackground.labelPlate5);
		mainPanel.add(classMyBackground.labelPlate10);
		mainPanel.add(classMyBackground.labelPlate9);
		mainPanel.add(classMyBackground.labelPlate8);
		mainPanel.add(classMyBackground.labelPlate7);
		mainPanel.add(classMyBackground.labelPlate6);
		mainPanel.add(classMyBackground.labelPlate11);
		mainPanel.add(classMyBackground.labelPlate12);
		mainPanel.add(classMyBackground.labelPlate13);
		mainPanel.add(classMyBackground.labelPlate14);
		mainPanel.add(classMyBackground.labelPlate15);
		mainPanel.add(classMyBackground.labelPlate20);
		mainPanel.add(classMyBackground.labelPlate19);
		mainPanel.add(classMyBackground.labelPlate18);
		mainPanel.add(classMyBackground.labelPlate17);
		mainPanel.add(classMyBackground.labelPlate16);
		mainPanel.add(classMyBackground.labelPlate21);
		mainPanel.add(classMyBackground.labelPlate22);
		mainPanel.add(classMyBackground.labelPlate23);
		mainPanel.add(classMyBackground.labelPlate24);
		mainPanel.add(classMyBackground.labelPlate25);
		
		//플레이어와 컴퓨터의 이름표지판 붙여넣기
		mainPanel.add(classMyBackground.playerBlue);
		mainPanel.add(classMyBackground.comRed);
		
		//플레이어와 컴퓨터의 점수 붙여넣기
		mainPanel.add(classMyBackground.toTalScoreBlue);
		mainPanel.add(classMyBackground.toTalScoreRed);
		
		//게임진행 주사위 버튼 붙여넣기
		mainPanel.add(classMyBackground.btnDice);

		//패널을 보이게 한다 and 스윙창을 닫으면 완전종료
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new NewGameMain().createGUI();
	}
}
