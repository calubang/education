package com.kitri.awt.design;

import java.awt.*;

public class ColorSelector extends Frame{
	
	//선언부
	String lStr[] = {"빨강", "초록", "파랑"};
	
	//패널
	Panel pWest = new Panel();
	Panel pEast = new Panel();
	
	//pc
	Panel pRed = new Panel(new BorderLayout());
	Panel pGreen = new Panel(new BorderLayout());
	Panel pBlue = new Panel(new BorderLayout());
	//라벨3개
	Label lR = new Label(lStr[0], Label.CENTER);
	Label lG = new Label(lStr[1], Label.CENTER);
	Label lB = new Label(lStr[2], Label.CENTER);
	//스크롤3개
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 255/2, 10, 0, 255); 
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 255/2, 10, 0, 255); 
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 255/2, 10, 0, 255); 
	
	//pe
	Panel pColor = new Panel();
	Panel pMenu = new Panel();
	Label lColor = new Label("", Label.CENTER);
	Button bExit = new Button("확인");
	
	public ColorSelector() {
		//pc
		lR.setBackground(Color.RED);
		lR.setForeground(Color.WHITE);
		lG.setBackground(Color.GREEN);
		lG.setForeground(Color.WHITE);
		lB.setBackground(Color.BLUE);
		lB.setForeground(Color.WHITE);
		pRed.add(lR, BorderLayout.WEST);
		pRed.add(sbR, BorderLayout.CENTER);
		pGreen.add(lG, BorderLayout.WEST);
		pGreen.add(sbG, BorderLayout.CENTER);
		pBlue.add(lB, BorderLayout.WEST);
		pBlue.add(sbB, BorderLayout.CENTER);
		
		
		pWest.setLayout(new GridLayout(7, 1, 10, 10));
		pWest.add(new Panel());
		pWest.add(new Panel());
		pWest.add(pRed);
		pWest.add(pGreen);
		pWest.add(pBlue);
		
		//pe
		pColor.setBackground(new Color(sbR.getValue(), sbG.getValue(), sbB.getValue()));
		lColor.setBackground(Color.CYAN);
		pMenu.setLayout(new BorderLayout());
		pMenu.add(lColor, BorderLayout.CENTER);
		pMenu.add(bExit, BorderLayout.EAST);
		
		pEast.setLayout(new BorderLayout());
		pEast.add(pColor, BorderLayout.CENTER);
		pEast.add(pMenu, BorderLayout.SOUTH);
		
		setLayout(new GridLayout(1, 2,  10, 10));
		add(pWest);
		add(pEast);
		
		setBounds(300, 200, 500, 500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorSelector();
	}
}
