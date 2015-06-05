package awt_test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class AWT_Test {

	public AWT_Test(){ // 생성자
		
		Frame frame = new Frame(" ## AWT_TEST ## "); // AWT_TEST 이름의 창 객체 생성
		
		MenuBar menuBar = new MenuBar(); // 최상위 메뉴바 객체 생성
		Menu fileMenu = new Menu("게시판"); // 메뉴바에 사용될 메뉴 객체 생성
		MenuItem menuItemA = new MenuItem("자유게시판"); // 메뉴에 속하는 메뉴 아이탬 객체 생성
		MenuItem menuItemB = new MenuItem("Q&A게시판");
		MenuItem menuItemC = new MenuItem("FAQ게시판");
		menuBar.add(fileMenu);
		fileMenu.add(menuItemA);
		fileMenu.add(menuItemB);
		fileMenu.add(menuItemC);
		Menu editMenu = new Menu("도움말"); // 메뉴바에 사용될 메뉴 객체 생성
		MenuItem menuItemD = new MenuItem("도움말 항목"); // 메뉴에 속하는 메뉴 아이탬 객체 생성
		MenuItem menuItemE = new MenuItem("게시판 정보");		
		menuBar.add(editMenu);
		editMenu.add(menuItemD);
		editMenu.add(menuItemE);
		
		frame.setLayout(new BorderLayout(5,5));
		
		Panel header = new Panel();
		Label headerLabel = new Label("Q&A 게시판");
		headerLabel.setFont(new Font("Serif", Font.PLAIN, 20));		
		header.add(headerLabel);
		header.setBackground(Color.GRAY);
		
		Panel body = new Panel(new FlowLayout());
		
		Panel subject = new Panel(new FlowLayout());
		subject.add(new Label("  제목", Label.RIGHT));
		subject.add(new TextField(40));		
		body.add(subject);
		
		Panel author = new Panel(new FlowLayout());
		author.add(new Label("작성자", Label.RIGHT));
		author.add(new TextField(10));
		author.add(new Label("                              작성일자", Label.RIGHT));
		author.add(new TextField(10));	
		body.add(author);
		
		Panel type = new Panel(new FlowLayout());
		type.add(new Label("질문유형", Label.RIGHT));
		Choice choice = new Choice();
		choice.add("질문유형A");
		choice.add("질문유형B");
		choice.add("질문유형C");
		type.add(choice);
		type.add(new Label("                              비밀번호", Label.RIGHT));
		TextField password = new TextField(10);
		password.setEchoChar('*');
		type.add(password);	
		body.add(type);
		
		Panel contents = new Panel(new FlowLayout());
		contents.add(new Label("내용", Label.RIGHT));
		TextArea textArea = new TextArea(10, 40);
		textArea.setText("내용은 한글 200자 영문 400자 입력가능 합니다.");
		contents.add(textArea);
		body.add(contents);
		
		Panel file = new Panel(new FlowLayout());
		file.add(new Label("파일첨부", Label.RIGHT));
		file.add(new TextField(30));
		file.add(new Button("파일열기"));
		body.add(file);
		
		
		/*
		Panel body_left = new Panel();
		body_left.setLayout(new GridLayout(4, 1, 0, 10));
		body_left.add(new Label("제목", Label.RIGHT));
		body_left.add(new Label("작성자", Label.RIGHT));		
		body_left.add(new Label("글쓴이", Label.RIGHT));
		body_left.add(new Label("내용", Label.RIGHT));

		Panel body_right = new Panel();
		body_right.setLayout(new GridLayout(4, 1, 0, 10));
		body_right.add(new TextField(20));
		body_right.add(new TextField(20));
		body_right.add(new TextField(20));
		
		TextArea textArea = new TextArea(20, 20);
		textArea.setLocation(165, 160);
		textArea.setSize(211, 190);
		frame.add(textArea);
		
		body.add(body_left);
		body.add(body_right);
		*/
		
		
		
		
		Panel footer = new Panel();
		footer.add(new Button("저장"));
		footer.add(new Button("목록"));
		
		frame.add("North", header);
		frame.add("Center", body);
		frame.add("South", footer);
		
		frame.setMenuBar(menuBar);
		
		frame.setLocation(100, 100); // 창이 뜨는 위치 설정
		frame.setSize(500, 450); // 창의 사이즈 설정 --> 가로500픽셀, 세로450픽셀
		frame.setVisible(true); // 창 보여주기
		
	}
	
	public static void main(String[] args) {

		new AWT_Test(); // 생성자 호출
		
	}

}
