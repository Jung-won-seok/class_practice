package Swing;


import java.awt.*;
import javax.swing.*;

public class calculator_practice {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(5, 5, 5, 5); // 버튼 주위 간격 추가

        JTextField textField = new JTextField();
        constraints.weightx = 1;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4; // 텍스트 필드는 모든 버튼의 상단에 위치하도록
        frame.add(textField, constraints);

        constraints.gridwidth = 1; // 나머지 버튼들은 기본적으로 1 칸만 차지하도록
        constraints.weightx = 0.5;

        String[] buttons = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", "/", "=", "AC"
        };

        int[][] gridPositions = {
                {0, 1}, {1, 1}, {2, 1}, {3, 1},
                {0, 2}, {1, 2}, {2, 2}, {3, 2},
                {0, 3}, {1, 3}, {2, 3}, {3, 3},
                {0, 4}, {1, 4}, {2, 4}, {3, 4},
                {0, 5, 2}, {2, 5}, {3, 5}
        };

        for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(buttons[i]);
            constraints.gridx = gridPositions[i][0];
            constraints.gridy = gridPositions[i][1];
            if (gridPositions[i].length == 3) {
                constraints.gridwidth = gridPositions[i][2];
            } else {
                constraints.gridwidth = 1;
            }
            frame.add(button, constraints);
        }

        // 프레임을 표시합니다.
        frame.setVisible(true);
    }
}
