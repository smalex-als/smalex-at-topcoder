package p500.srm595;

import utils.ExampleRunner;

public class LittleElephantAndBallsAgain {
	public int getNumber(String S) {
    int[] max = new int[3];
    int prev = -1;
    int cnt = 0;
    for (int i = 0; i < S.length(); i++) {
      int c = S.charAt(i) == 'R' ? 0 : (S.charAt(i) == 'G' ? 1 : 2);
      if (prev == -1 || c != prev) {
        if (prev != -1) {
          max[prev] = Math.max(max[prev], cnt);
        }
        prev = c;
        cnt = 0;
      }
      cnt++;
      if (i + 1 == S.length()) {
        max[c] = Math.max(max[c], cnt);
      }
    }
    int m = max[0];
    for (int i : max) {
      if (i > m) {
        m = i;
      }
    }
    return S.length() - m;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 4, new LittleElephantAndBallsAgain().getNumber("RRGGBB"));
  		ExampleRunner.eq(2, 0, new LittleElephantAndBallsAgain().getNumber("R"));
  		ExampleRunner.eq(3, 5, new LittleElephantAndBallsAgain().getNumber("RGBRGB"));
  		ExampleRunner.eq(4, 3, new LittleElephantAndBallsAgain().getNumber("RGGGBB"));
  		ExampleRunner.eq(5, 46, new LittleElephantAndBallsAgain().getNumber("RGBRBRGRGRBBBGRBRBRGBGBBBGRGBBBBRGBGRRGGRRRGRBBBBR"));
  		ExampleRunner.eq(6, 0, new LittleElephantAndBallsAgain().getNumber("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR"));
  		ExampleRunner.eq(7, 0, new LittleElephantAndBallsAgain().getNumber("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG"));
  		ExampleRunner.eq(8, 0, new LittleElephantAndBallsAgain().getNumber("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
  		ExampleRunner.eq(9, 38, new LittleElephantAndBallsAgain().getNumber("BGGBGRRGBBBGRGBGBRRRRBRGGRBBBBRBRRGBGGRBRB"));
  		ExampleRunner.eq(10, 31, new LittleElephantAndBallsAgain().getNumber("RBRGBGBBGRRGBRGGGBBRRGGBGGBRBRGBRR"));
  		ExampleRunner.eq(11, 40, new LittleElephantAndBallsAgain().getNumber("BRBRGRBGBBGRRBGBGBRRBRBGRRRRBBRBBBGRRBRRRGRB"));
  		ExampleRunner.eq(12, 34, new LittleElephantAndBallsAgain().getNumber("BBRGBGBGRGGGRBGRGBRRBBGBBRBGBGRBRBRBG"));
  		ExampleRunner.eq(13, 8, new LittleElephantAndBallsAgain().getNumber("RBBRGRBBGB"));
  		ExampleRunner.eq(14, 20, new LittleElephantAndBallsAgain().getNumber("GRRRRRGGRBGRBRBGBBGRGBRRB"));
  		ExampleRunner.eq(15, 11, new LittleElephantAndBallsAgain().getNumber("GBBBRBBGBGRBGR"));
  		ExampleRunner.eq(16, 45, new LittleElephantAndBallsAgain().getNumber("GBRGRRGRGBBRRRRBBBBBGGRRGGBBGBBBRGGRBRBRRBGBBBGRRR"));
  		ExampleRunner.eq(17, 45, new LittleElephantAndBallsAgain().getNumber("RBRGBBRGBBBBBRGBRRRRGGGBGGGRRGBBRBBBRGRBGBGGBGRGRB"));
  		ExampleRunner.eq(18, 44, new LittleElephantAndBallsAgain().getNumber("GGGGGGRGGBRGBGBGBRRGBGBBBGRGRBBBBRGGRGGGRBGGRBGBBB"));
  		ExampleRunner.eq(19, 47, new LittleElephantAndBallsAgain().getNumber("RRBRBBRGRGBBBGBRBBGBGBRRBRBGBBGRBGBBGBBRBBGBGBRGGG"));
  		ExampleRunner.eq(20, 47, new LittleElephantAndBallsAgain().getNumber("BRGRRBRBBGBBBGBBRBBGGBGBBBGGBBGRBGBGBGGBGRGBGRBGGR"));
  		ExampleRunner.eq(21, 46, new LittleElephantAndBallsAgain().getNumber("RGBGBRBGRRRGGRGRBRGGBGBBGRBBGGBGGGGBGGRRBRGRBBGBGB"));
  		ExampleRunner.eq(22, 46, new LittleElephantAndBallsAgain().getNumber("RGGGGBBRRGBGGBRBBGGBRRRRGRGRGGRGGGRBRRRGRRGRBBGBRR"));
  		ExampleRunner.eq(23, 47, new LittleElephantAndBallsAgain().getNumber("BRRGBGGRBBRBGRGGBBBRBBGBRGBRBRGGRRBBBRBGGRGGRGBBBR"));
  		ExampleRunner.eq(24, 9, new LittleElephantAndBallsAgain().getNumber("RGBRGGRBBRG"));
  		ExampleRunner.eq(25, 46, new LittleElephantAndBallsAgain().getNumber("GRGRGRRBRGGBRBGRBRBGGBGRRGRRGGGGRRGBRRBBGRBGGRRBRB"));
  		ExampleRunner.eq(26, 45, new LittleElephantAndBallsAgain().getNumber("GRRRRGGGGRRGRRGRGGGRRRGRGGGRGRGRRRGGRRRGRGGGGGRGGG"));
  		ExampleRunner.eq(27, 44, new LittleElephantAndBallsAgain().getNumber("GGRGGGGGGRRRRGRRRRRGGRRRGRGGRGRGGRRGGGRRGRRGGGGGRR"));
  		ExampleRunner.eq(28, 43, new LittleElephantAndBallsAgain().getNumber("RRGGRRRRRRGGRGRRGGGRRGRRRRRRRGGGRGGGGRRRRRGGRRRRGR"));
  		ExampleRunner.eq(29, 44, new LittleElephantAndBallsAgain().getNumber("RGRRRGGGRRRRRRGGRGRGGRGGRRGRRRGGGRGRGGGGGRRGGRGRRG"));
  		ExampleRunner.eq(30, 43, new LittleElephantAndBallsAgain().getNumber("GRRGGGGGGGRRGRGGGGRGRRRRGRRRRGGGGGRRGRGRRGGRGRGGRR"));
  		ExampleRunner.eq(31, 45, new LittleElephantAndBallsAgain().getNumber("RBBRBBBBBRBRBRRBBRRRBBRBRBBRRRRRBBRRRBRBRBBRBRBBRB"));
  		ExampleRunner.eq(32, 46, new LittleElephantAndBallsAgain().getNumber("RRRRBBBRRRRBRRRBRRRBRRBRBRBRRRBRBBRBRRBRRRRBRRRRBB"));
  		ExampleRunner.eq(33, 44, new LittleElephantAndBallsAgain().getNumber("RRBRRRRRBRRRRBBRBRBRBRBRRBBRBRRRBRBBRBRRRRRRBRBBBB"));
  		ExampleRunner.eq(34, 44, new LittleElephantAndBallsAgain().getNumber("BRRRBRBRBRBBRBRBBRBRBRBRRRBBBBBRBBRRRRBBRBRRRRRRBR"));
  		ExampleRunner.eq(35, 41, new LittleElephantAndBallsAgain().getNumber("BBBBBBBBBRRBBRRBRBRBBBBRRRBRRRRRBRRRBBRRRRBRRRBRBB"));
  		ExampleRunner.eq(36, 46, new LittleElephantAndBallsAgain().getNumber("BBGGBGBGGBGGGBGBGBBGGGBGBGGGBGBGGGBBBGBGBGBGGGGBGG"));
  		ExampleRunner.eq(37, 44, new LittleElephantAndBallsAgain().getNumber("BGGBBBGBGGBGBGBGBBGBBGBGBGBBBBGGBGBGGBBBBBBGGGGBGB"));
  		ExampleRunner.eq(38, 43, new LittleElephantAndBallsAgain().getNumber("GGGBGBBBBBBBGGGGGBGGBGBGBGGGGGGBGBBBGBBGGGGBBGBGBB"));
  		ExampleRunner.eq(39, 44, new LittleElephantAndBallsAgain().getNumber("BGGBGGGGGBGGBGBBGGGGBGGGGBGBGGBBBBBBGGGBBGBBGGGBBG"));
  		ExampleRunner.eq(40, 45, new LittleElephantAndBallsAgain().getNumber("BGGBBBBGGBGBGGGBBBGBBGGBGBBBBBGBGGGGGBGBBBGGGGBGBB"));
  		ExampleRunner.eq(41, 38, new LittleElephantAndBallsAgain().getNumber("GGGGGGGBGGGBGGGGGGGGGGGGBGGGGGGGBBGGGGGGRGGGGGGGGG"));
  		ExampleRunner.eq(42, 27, new LittleElephantAndBallsAgain().getNumber("GGGGRGGGGGRGBGGGGGGGGGGGGGGGGGGGGGGGBBGGRGGGGGGGBG"));
  		ExampleRunner.eq(43, 38, new LittleElephantAndBallsAgain().getNumber("RGGGGRGGRGGGGGGGBGGGRGGBGGRGRRGGRGGGGGGGGGGGGBGGGB"));
  		ExampleRunner.eq(44, 34, new LittleElephantAndBallsAgain().getNumber("RBRRRRRRRRRRRRRRRRBBRRBRBRRBRBRRRRRRRRRRRBRBBRRRRR"));
  		ExampleRunner.eq(45, 39, new LittleElephantAndBallsAgain().getNumber("RBBRRBRBRRRBRRRBRRRRRRRRRRBRBRRRRRRRRRRRBRRBBRRBRR"));
  		ExampleRunner.eq(46, 39, new LittleElephantAndBallsAgain().getNumber("BBRRRBRBBRBRRRBRRRRRRBBRRBRRRRRBRBRRRRRRRRRRRBBRRR"));
  		ExampleRunner.eq(47, 3, new LittleElephantAndBallsAgain().getNumber("RGGBBB"));
  		ExampleRunner.eq(48, 3, new LittleElephantAndBallsAgain().getNumber("GGGBRR"));
  		ExampleRunner.eq(49, 20, new LittleElephantAndBallsAgain().getNumber("RRRRRRRRRRBBBBBBBBBBGGGGGGGGGGG"));
  		ExampleRunner.eq(50, 2, new LittleElephantAndBallsAgain().getNumber("RGRRR"));
  		ExampleRunner.eq(51, 49, new LittleElephantAndBallsAgain().getNumber("RGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRGBRG"));
  		ExampleRunner.eq(52, 2, new LittleElephantAndBallsAgain().getNumber("RRGGG"));
  		ExampleRunner.eq(53, 1, new LittleElephantAndBallsAgain().getNumber("GBB"));
  		ExampleRunner.eq(54, 2, new LittleElephantAndBallsAgain().getNumber("RGBBB"));
  		ExampleRunner.eq(55, 0, new LittleElephantAndBallsAgain().getNumber("RRRRRRRRR"));
  		ExampleRunner.eq(56, 0, new LittleElephantAndBallsAgain().getNumber("RRRR"));
  		ExampleRunner.eq(57, 0, new LittleElephantAndBallsAgain().getNumber("RR"));
  		ExampleRunner.eq(58, 1, new LittleElephantAndBallsAgain().getNumber("RGGG"));
  		ExampleRunner.eq(59, 4, new LittleElephantAndBallsAgain().getNumber("RRGGGBB"));
  		ExampleRunner.eq(60, 0, new LittleElephantAndBallsAgain().getNumber("RRRRRRR"));
  		ExampleRunner.eq(61, 0, new LittleElephantAndBallsAgain().getNumber("BBBBBBBBBBB"));
  		ExampleRunner.eq(62, 2, new LittleElephantAndBallsAgain().getNumber("GGBBBB"));
  		ExampleRunner.eq(63, 0, new LittleElephantAndBallsAgain().getNumber("RRRRRRRRRR"));
  		ExampleRunner.eq(64, 0, new LittleElephantAndBallsAgain().getNumber("RRRRRR"));
  		ExampleRunner.eq(65, 0, new LittleElephantAndBallsAgain().getNumber("RRR"));
  		ExampleRunner.eq(66, 1, new LittleElephantAndBallsAgain().getNumber("GGGR"));
  		ExampleRunner.eq(67, 0, new LittleElephantAndBallsAgain().getNumber("GGGGGGG"));
  		ExampleRunner.eq(68, 3, new LittleElephantAndBallsAgain().getNumber("BRGBBBBBB"));
  		ExampleRunner.eq(69, 3, new LittleElephantAndBallsAgain().getNumber("RRRGGR"));
  		ExampleRunner.eq(70, 2, new LittleElephantAndBallsAgain().getNumber("BBRRRRRRRRRRRR"));
  		ExampleRunner.eq(71, 3, new LittleElephantAndBallsAgain().getNumber("GRRGGG"));
  		ExampleRunner.eq(72, 7, new LittleElephantAndBallsAgain().getNumber("GGGBBBBBGGGG"));
  		ExampleRunner.eq(73, 2, new LittleElephantAndBallsAgain().getNumber("RGBBBBBBBBBBB"));
  		ExampleRunner.eq(74, 1, new LittleElephantAndBallsAgain().getNumber("RGG"));
  		ExampleRunner.eq(75, 7, new LittleElephantAndBallsAgain().getNumber("RRGGBBRGB"));
  }
}
