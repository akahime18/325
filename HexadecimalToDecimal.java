/*  1:   */ package maria;
/*  2:   */ 
/*  3:   */ public class HexadecimalToDecimal
/*  4:   */ {
/*  5:   */   public int convert(String hexadecimal)
/*  6:   */   {
/*  7: 9 */     int decimal = 0;
/*  8:10 */     char[] hexadecimalArray = hexadecimal.toCharArray();
/*  9:11 */     for (int a = 0; a < hexadecimalArray.length; a++)
/* 10:   */     {
/* 11:12 */       int value = 0;
/* 12:13 */       switch (hexadecimalArray[a])
/* 13:   */       {
/* 14:   */       case '0': 
/* 15:14 */         value = 0; break;
/* 16:   */       case '1': 
/* 17:15 */         value = 1; break;
/* 18:   */       case '2': 
/* 19:16 */         value = 2; break;
/* 20:   */       case '3': 
/* 21:17 */         value = 3; break;
/* 22:   */       case '4': 
/* 23:18 */         value = 4; break;
/* 24:   */       case '5': 
/* 25:19 */         value = 5; break;
/* 26:   */       case '6': 
/* 27:20 */         value = 6; break;
/* 28:   */       case '7': 
/* 29:21 */         value = 7; break;
/* 30:   */       case '8': 
/* 31:22 */         value = 8; break;
/* 32:   */       case '9': 
/* 33:23 */         value = 9; break;
/* 34:   */       case 'a': 
/* 35:24 */         value = 10; break;
/* 36:   */       case 'b': 
/* 37:25 */         value = 11; break;
/* 38:   */       case 'c': 
/* 39:26 */         value = 12; break;
/* 40:   */       case 'd': 
/* 41:27 */         value = 13; break;
/* 42:   */       case 'e': 
/* 43:28 */         value = 14; break;
/* 44:   */       case 'f': 
/* 45:29 */         value = 15;
/* 46:   */       }
/* 47:31 */       decimal = (int)(decimal + value * Math.pow(16.0D, hexadecimalArray.length - 1 - Double.parseDouble("" + a)));
/* 48:   */     }
/* 49:33 */     return decimal;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Users\acvillalon\Downloads\MARIA_Simulator.jar.jar
 * Qualified Name:     maria.HexadecimalToDecimal
 * JD-Core Version:    0.7.0.1
 */