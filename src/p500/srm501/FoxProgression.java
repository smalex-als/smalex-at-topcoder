package p500.srm501;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 30.03.11
 * Time: 15:04
 */
public class FoxProgression {
  public int theCount(int[] seq) {
    if (seq.length == 1) {
      return -1;
    }
    int result = okCase1(seq);
    result += okCase2(seq);
    return result;
  }

  private int okCase1(int[] seq) {
    int diff = seq[1] - seq[0];
    for (int i = 1; i < seq.length; i++) {
      if (seq[i] - seq[i - 1] != diff) {
        return 0;
      }
    }
    return 1;
  }

  private int okCase2(int[] seq) {
    int diff = seq[1] / seq[0];
    if (diff == 0 || diff == 1) {
      return 0;
    }
    for (int i = 1; i < seq.length; i++) {
      if (seq[i - 1] * diff != seq[i]) {
        return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 1, new FoxProgression().theCount(new int[]{1, 2, 4, 8}));
    ExampleRunner.eq(2, 1, new FoxProgression().theCount(new int[]{5, 3, 1}));
    ExampleRunner.eq(3, 1, new FoxProgression().theCount(new int[]{1, 1}));
    ExampleRunner.eq(4, 1, new FoxProgression().theCount(new int[]{8, 4}));
    ExampleRunner.eq(5, -1, new FoxProgression().theCount(new int[]{1}));
    ExampleRunner.eq(6, 2, new FoxProgression().theCount(new int[]{4, 8}));
    ExampleRunner.eq(7, 0, new FoxProgression().theCount(new int[]{1, 3, 4}));
    ExampleRunner.eq(8, 1, new FoxProgression().theCount(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
    ExampleRunner.eq(9, 1, new FoxProgression().theCount(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500}));
    ExampleRunner.eq(10, 2, new FoxProgression().theCount(new int[]{1, 500}));
    ExampleRunner.eq(11, 1, new FoxProgression().theCount(new int[]{500, 1}));
    ExampleRunner.eq(12, 1, new FoxProgression().theCount(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256}));
    ExampleRunner.eq(13, -1, new FoxProgression().theCount(new int[]{500}));
    ExampleRunner.eq(14, 1, new FoxProgression().theCount(new int[]{500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500}));
    ExampleRunner.eq(15, 1, new FoxProgression().theCount(new int[]{499, 500}));
    ExampleRunner.eq(16, 1, new FoxProgression().theCount(new int[]{2, 1}));
    ExampleRunner.eq(17, 0, new FoxProgression().theCount(new int[]{64, 96, 144, 216, 324, 486}));
    ExampleRunner.eq(18, 1, new FoxProgression().theCount(new int[]{4, 6}));
    ExampleRunner.eq(19, 2, new FoxProgression().theCount(new int[]{128, 256}));
    ExampleRunner.eq(20, 1, new FoxProgression().theCount(new int[]{500, 499}));
    ExampleRunner.eq(21, 1, new FoxProgression().theCount(new int[]{500, 499, 498, 497, 496, 495, 494, 493, 492, 491, 490, 489, 488, 487, 486, 485, 484, 483, 482, 481, 480, 479, 478, 477, 476, 475, 474, 473, 472, 471, 470, 469, 468, 467, 466, 465, 464, 463, 462, 461, 460, 459, 458, 457, 456, 455, 454, 453, 452, 451}));
    ExampleRunner.eq(22, 0, new FoxProgression().theCount(new int[]{500, 499, 498, 497, 496, 495, 494, 493, 492, 491, 490, 489, 488, 487, 486, 485, 484, 483, 482, 481, 480, 479, 478, 477, 476, 475, 474, 473, 472, 471, 470, 468, 468, 467, 466, 465, 464, 463, 462, 461, 460, 459, 458, 457, 456, 455, 454, 453, 452, 451}));
    ExampleRunner.eq(23, 1, new FoxProgression().theCount(new int[]{451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500}));
    ExampleRunner.eq(24, 0, new FoxProgression().theCount(new int[]{451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 490, 492, 493, 494, 495, 496, 497, 498, 499, 500}));
    ExampleRunner.eq(25, 0, new FoxProgression().theCount(new int[]{1, 1, 2, 2, 3, 3}));
    ExampleRunner.eq(26, 0, new FoxProgression().theCount(new int[]{3, 1, 2}));
    ExampleRunner.eq(27, 0, new FoxProgression().theCount(new int[]{1, 2, 3, 1, 2, 3}));
    ExampleRunner.eq(28, 1, new FoxProgression().theCount(new int[]{19, 64, 109}));
    ExampleRunner.eq(29, 1, new FoxProgression().theCount(new int[]{77, 111, 145, 179, 213, 247, 281, 315, 349, 383, 417, 451, 485}));
    ExampleRunner.eq(30, 1, new FoxProgression().theCount(new int[]{67, 76, 85, 94, 103, 112, 121, 130, 139, 148, 157, 166, 175, 184, 193, 202, 211, 220, 229, 238, 247, 256, 265, 274, 283, 292, 301, 310, 319, 328, 337, 346, 355, 364, 373, 382, 391, 400, 409, 418, 427, 436, 445}));
    ExampleRunner.eq(31, 1, new FoxProgression().theCount(new int[]{7, 25, 43, 61, 79, 97, 115, 133, 151, 169, 187, 205, 223, 241, 259, 277, 295, 313, 331, 349, 367, 385, 403, 421, 439, 457}));
    ExampleRunner.eq(32, 1, new FoxProgression().theCount(new int[]{357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397}));
    ExampleRunner.eq(33, 1, new FoxProgression().theCount(new int[]{178, 196, 214, 232, 250, 268, 286, 304, 322, 340, 358, 376, 394, 412, 430, 448}));
    ExampleRunner.eq(34, 1, new FoxProgression().theCount(new int[]{15, 40, 65, 90, 115, 140, 165, 190, 215, 240, 265, 290, 315, 340, 365, 390, 415, 440, 465, 490}));
    ExampleRunner.eq(35, 0, new FoxProgression().theCount(new int[]{446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 190, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446, 446}));
    ExampleRunner.eq(36, 0, new FoxProgression().theCount(new int[]{466, 107, 324, 485, 190, 152, 48, 315, 375, 31, 120, 381, 187, 274, 33, 239, 361, 47, 313, 336, 167, 193, 310, 272, 391, 214, 193, 85, 475, 306, 216, 340, 342, 246, 300, 430, 191, 386, 70, 302, 303, 154, 378, 167}));
    ExampleRunner.eq(37, 1, new FoxProgression().theCount(new int[]{22, 40, 58, 76, 94, 112, 130, 148, 166, 184, 202, 220, 238, 256, 274, 292, 310, 328, 346, 364, 382, 400, 418, 436, 454, 472, 490}));
    ExampleRunner.eq(38, 0, new FoxProgression().theCount(new int[]{7, 41, 43, 52, 57, 57, 60, 65, 70, 73, 83, 89, 100, 134, 140, 150, 164, 184, 185, 186, 190, 195, 225, 256, 260, 270, 271, 275, 311, 333, 359, 373, 383, 423, 439, 445, 481, 484, 495, 498, 500}));
    ExampleRunner.eq(39, 1, new FoxProgression().theCount(new int[]{254, 257, 260, 263, 266, 269, 272, 275, 278, 281, 284, 287, 290, 293, 296, 299, 302, 305, 308, 311, 314, 317, 320, 323, 326, 329, 332, 335, 338, 341, 344, 347, 350, 353, 356, 359}));
    ExampleRunner.eq(40, 1, new FoxProgression().theCount(new int[]{314, 314, 314, 314, 314}));
    ExampleRunner.eq(41, 0, new FoxProgression().theCount(new int[]{422, 293, 247, 376, 65, 208, 99, 117, 369, 260, 349, 33, 247, 392, 89, 299, 267, 421, 459, 443, 262, 260, 415, 153, 360, 373, 335, 383, 480, 370, 136, 246, 490, 479, 159, 71, 131, 389, 296, 228, 29, 488, 454, 213}));
    ExampleRunner.eq(42, 1, new FoxProgression().theCount(new int[]{300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300}));
    ExampleRunner.eq(43, 0, new FoxProgression().theCount(new int[]{59, 70, 81, 92, 103, 114, 125, 136, 147, 158, 169, 180, 191, 202, 213, 224, 235, 246, 257, 268, 279, 290, 25, 312, 323, 334, 345, 356, 367, 378, 389, 400, 411, 422, 433}));
    ExampleRunner.eq(44, 1, new FoxProgression().theCount(new int[]{92, 256, 420}));
    ExampleRunner.eq(45, 1, new FoxProgression().theCount(new int[]{26, 133}));
    ExampleRunner.eq(46, 1, new FoxProgression().theCount(new int[]{3, 6, 12, 24, 48, 96, 192, 384}));
    ExampleRunner.eq(47, -1, new FoxProgression().theCount(new int[]{329}));
    ExampleRunner.eq(48, 0, new FoxProgression().theCount(new int[]{32, 96, 484, 187, 63}));
    ExampleRunner.eq(49, 0, new FoxProgression().theCount(new int[]{50, 64, 78, 92, 106, 120, 134, 148, 162, 176, 190, 204, 218, 232, 246, 260, 274, 288, 105, 316, 330, 344, 358, 372, 386, 400, 414, 428, 442, 456, 470, 484, 498}));
    ExampleRunner.eq(50, 1, new FoxProgression().theCount(new int[]{159, 168, 177, 186, 195, 204, 213, 222, 231, 240, 249, 258, 267, 276, 285, 294, 303, 312, 321, 330, 339, 348, 357, 366, 375, 384, 393, 402, 411, 420}));
    ExampleRunner.eq(51, 1, new FoxProgression().theCount(new int[]{39, 56, 73, 90, 107, 124, 141, 158, 175, 192, 209, 226, 243, 260, 277, 294, 311, 328, 345, 362, 379, 396, 413, 430, 447, 464, 481, 498}));
    ExampleRunner.eq(52, 0, new FoxProgression().theCount(new int[]{20, 31, 54, 61, 110, 147, 141, 158, 202, 209, 239, 261, 265, 285, 293, 296, 297, 308, 327, 334, 338, 355, 420, 425, 437, 445, 446, 499}));
    ExampleRunner.eq(53, 1, new FoxProgression().theCount(new int[]{76, 80, 84, 88, 92, 96, 100, 104, 108, 112, 116, 120, 124, 128, 132, 136, 140, 144, 148, 152, 156, 160, 164, 168, 172, 176}));
    ExampleRunner.eq(54, 1, new FoxProgression().theCount(new int[]{22, 41, 60, 79, 98, 117, 136, 155, 174, 193, 212, 231, 250, 269, 288}));
    ExampleRunner.eq(55, 0, new FoxProgression().theCount(new int[]{70, 70, 70, 70, 70, 480, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70}));
    ExampleRunner.eq(56, 1, new FoxProgression().theCount(new int[]{2, 4, 8, 16, 32, 64, 128}));
    ExampleRunner.eq(57, 1, new FoxProgression().theCount(new int[]{243, 245, 247, 249, 251, 253, 255, 257, 259, 261, 263, 265, 267, 269, 271, 273, 275, 277, 279, 281, 283, 285, 287, 289, 291}));
    ExampleRunner.eq(58, 1, new FoxProgression().theCount(new int[]{4, 8, 16, 32, 64, 128, 256}));
    ExampleRunner.eq(59, 1, new FoxProgression().theCount(new int[]{1, 22, 484}));
    ExampleRunner.eq(60, 1, new FoxProgression().theCount(new int[]{2, 30, 450}));
    ExampleRunner.eq(61, 2, new FoxProgression().theCount(new int[]{10, 490}));
    ExampleRunner.eq(62, 0, new FoxProgression().theCount(new int[]{362, 321, 325, 158, 24, 135, 102, 22, 95, 153, 197, 491, 2, 440, 82, 114, 113, 165, 195, 214, 283, 307, 367, 12, 32, 362, 416, 277, 373, 409, 187, 199, 222, 381, 483, 42, 112, 50, 149, 226}));
    ExampleRunner.eq(63, 1, new FoxProgression().theCount(new int[]{65, 135, 205, 275, 345, 415, 485}));
    ExampleRunner.eq(64, 0, new FoxProgression().theCount(new int[]{456, 456, 456, 186, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456}));
    ExampleRunner.eq(65, 1, new FoxProgression().theCount(new int[]{105, 113, 121, 129, 137, 145, 153, 161, 169, 177, 185, 193, 201, 209, 217, 225, 233, 241, 249, 257, 265, 273, 281, 289, 297, 305, 313, 321, 329, 337, 345}));
    ExampleRunner.eq(66, 1, new FoxProgression().theCount(new int[]{37, 47, 57, 67, 77, 87, 97, 107, 117, 127, 137, 147, 157, 167, 177, 187, 197, 207, 217, 227, 237, 247, 257, 267, 277, 287, 297, 307, 317, 327, 337, 347, 357, 367, 377, 387, 397, 407, 417, 427}));
    ExampleRunner.eq(67, -1, new FoxProgression().theCount(new int[]{58}));
    ExampleRunner.eq(68, 0, new FoxProgression().theCount(new int[]{8, 8, 7}));
    ExampleRunner.eq(69, 2, new FoxProgression().theCount(new int[]{2, 4}));
    ExampleRunner.eq(70, 1, new FoxProgression().theCount(new int[]{5, 3, 1}));
    ExampleRunner.eq(71, 1, new FoxProgression().theCount(new int[]{2, 3}));
    ExampleRunner.eq(72, 1, new FoxProgression().theCount(new int[]{1, 1}));
    ExampleRunner.eq(73, 1, new FoxProgression().theCount(new int[]{4, 7}));
    ExampleRunner.eq(74, 0, new FoxProgression().theCount(new int[]{27, 9, 3}));
    ExampleRunner.eq(75, -1, new FoxProgression().theCount(new int[]{3}));
    ExampleRunner.eq(76, 0, new FoxProgression().theCount(new int[]{5, 1, 3}));
    ExampleRunner.eq(77, 1, new FoxProgression().theCount(new int[]{8, 4}));
    ExampleRunner.eq(78, 1, new FoxProgression().theCount(new int[]{1, 1, 1}));
    ExampleRunner.eq(79, 0, new FoxProgression().theCount(new int[]{1, 2, 4, 8, 15, 115}));
    ExampleRunner.eq(80, 0, new FoxProgression().theCount(new int[]{2, 4, 8, 17}));
    ExampleRunner.eq(81, 0, new FoxProgression().theCount(new int[]{1, 1, 2}));
    ExampleRunner.eq(82, -1, new FoxProgression().theCount(new int[]{2}));
    ExampleRunner.eq(83, 0, new FoxProgression().theCount(new int[]{1, 2, 5}));
    ExampleRunner.eq(84, 1, new FoxProgression().theCount(new int[]{3, 10}));
    ExampleRunner.eq(85, 0, new FoxProgression().theCount(new int[]{1, 2, 4, 8, 15}));
    ExampleRunner.eq(86, 0, new FoxProgression().theCount(new int[]{1, 2, 3, 4, 6}));
    ExampleRunner.eq(87, 0, new FoxProgression().theCount(new int[]{1, 3, 9, 28}));
    ExampleRunner.eq(88, 0, new FoxProgression().theCount(new int[]{3, 3, 3, 1}));
    ExampleRunner.eq(89, 0, new FoxProgression().theCount(new int[]{1, 2, 4, 10}));
    ExampleRunner.eq(90, 0, new FoxProgression().theCount(new int[]{4, 6, 7}));
    ExampleRunner.eq(91, 1, new FoxProgression().theCount(new int[]{4, 4}));
    ExampleRunner.eq(92, 1, new FoxProgression().theCount(new int[]{2, 5}));
    ExampleRunner.eq(93, 0, new FoxProgression().theCount(new int[]{3, 6, 13}));
    ExampleRunner.eq(94, 0, new FoxProgression().theCount(new int[]{3, 4, 7}));
    ExampleRunner.eq(95, 2, new FoxProgression().theCount(new int[]{1, 2}));
    ExampleRunner.eq(96, 0, new FoxProgression().theCount(new int[]{1, 1, 1, 1, 2, 4, 8}));
    ExampleRunner.eq(97, -1, new FoxProgression().theCount(new int[]{1}));
    ExampleRunner.eq(98, 1, new FoxProgression().theCount(new int[]{8, 8, 8, 8, 8}));
    ExampleRunner.eq(99, 0, new FoxProgression().theCount(new int[]{9, 6, 4}));
    ExampleRunner.eq(100, 1, new FoxProgression().theCount(new int[]{10, 10, 10, 10, 10, 10}));
    ExampleRunner.eq(101, 0, new FoxProgression().theCount(new int[]{2, 3, 5}));
    ExampleRunner.eq(102, 1, new FoxProgression().theCount(new int[]{5, 11}));
    ExampleRunner.eq(103, 0, new FoxProgression().theCount(new int[]{1, 1, 1, 2, 4, 8, 16}));
    ExampleRunner.eq(104, 0, new FoxProgression().theCount(new int[]{2, 6, 19}));
    ExampleRunner.eq(105, 1, new FoxProgression().theCount(new int[]{5, 7}));
    ExampleRunner.eq(106, 1, new FoxProgression().theCount(new int[]{3, 1}));
    ExampleRunner.eq(107, 0, new FoxProgression().theCount(new int[]{1, 2, 4, 2}));
    ExampleRunner.eq(108, 0, new FoxProgression().theCount(new int[]{1, 2, 3, 4, 5, 10}));
    ExampleRunner.eq(109, -1, new FoxProgression().theCount(new int[]{5}));
    ExampleRunner.eq(110, 0, new FoxProgression().theCount(new int[]{4, 9, 18, 36}));
    ExampleRunner.eq(111, 0, new FoxProgression().theCount(new int[]{3, 1, 3, 5}));
    ExampleRunner.eq(112, 1, new FoxProgression().theCount(new int[]{5, 6}));
    ExampleRunner.eq(113, 0, new FoxProgression().theCount(new int[]{2, 5, 2}));
    ExampleRunner.eq(114, 1, new FoxProgression().theCount(new int[]{1, 1, 1, 1, 1}));
    ExampleRunner.eq(115, 0, new FoxProgression().theCount(new int[]{2, 5, 11, 23}));
    ExampleRunner.eq(116, 1, new FoxProgression().theCount(new int[]{1, 1, 1, 1}));
    ExampleRunner.eq(117, 0, new FoxProgression().theCount(new int[]{1, 2, 3, 5}));
    ExampleRunner.eq(118, 0, new FoxProgression().theCount(new int[]{1, 2, 6}));
    ExampleRunner.eq(119, 1, new FoxProgression().theCount(new int[]{1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(120, 1, new FoxProgression().theCount(new int[]{8, 12}));
    ExampleRunner.eq(121, 0, new FoxProgression().theCount(new int[]{8, 4, 2}));
    ExampleRunner.eq(122, 1, new FoxProgression().theCount(new int[]{100, 1}));
    ExampleRunner.eq(123, 1, new FoxProgression().theCount(new int[]{4, 10}));
    ExampleRunner.eq(124, 0, new FoxProgression().theCount(new int[]{1, 2, 4, 8, 467}));
    ExampleRunner.eq(125, 0, new FoxProgression().theCount(new int[]{5, 3, 2}));
    ExampleRunner.eq(126, 0, new FoxProgression().theCount(new int[]{1, 1, 100}));
    ExampleRunner.eq(127, 1, new FoxProgression().theCount(new int[]{3, 3}));
    ExampleRunner.eq(128, 1, new FoxProgression().theCount(new int[]{3, 2}));
    ExampleRunner.eq(129, 1, new FoxProgression().theCount(new int[]{100, 10}));
    ExampleRunner.eq(130, 1, new FoxProgression().theCount(new int[]{6, 15}));
    ExampleRunner.eq(131, 0, new FoxProgression().theCount(new int[]{1, 2, 3, 6}));
    ExampleRunner.eq(132, 0, new FoxProgression().theCount(new int[]{4, 10, 25}));
    ExampleRunner.eq(133, 1, new FoxProgression().theCount(new int[]{1, 3, 5, 7}));
    ExampleRunner.eq(134, 0, new FoxProgression().theCount(new int[]{2, 4, 16, 18}));
    ExampleRunner.eq(135, 0, new FoxProgression().theCount(new int[]{12, 30, 75}));
    ExampleRunner.eq(136, 0, new FoxProgression().theCount(new int[]{1, 2, 4, 8, 17}));
    ExampleRunner.eq(137, 1, new FoxProgression().theCount(new int[]{2, 2}));
    ExampleRunner.eq(138, 2, new FoxProgression().theCount(new int[]{1, 3}));
    ExampleRunner.eq(139, 0, new FoxProgression().theCount(new int[]{3, 7, 16}));
    ExampleRunner.eq(140, 1, new FoxProgression().theCount(new int[]{2, 2, 2}));
    ExampleRunner.eq(141, 0, new FoxProgression().theCount(new int[]{2, 5, 10}));
    ExampleRunner.eq(142, 1, new FoxProgression().theCount(new int[]{27, 9}));
    ExampleRunner.eq(143, 0, new FoxProgression().theCount(new int[]{2, 1, 1}));
    ExampleRunner.eq(144, 1, new FoxProgression().theCount(new int[]{1, 3, 9, 27}));
    ExampleRunner.eq(145, 1, new FoxProgression().theCount(new int[]{5, 8}));
    ExampleRunner.eq(146, 0, new FoxProgression().theCount(new int[]{2, 4, 9}));
    ExampleRunner.eq(147, 0, new FoxProgression().theCount(new int[]{5, 10, 20, 40, 81}));
  }
}
