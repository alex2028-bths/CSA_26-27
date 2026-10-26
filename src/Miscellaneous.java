void main(String[] args) {
   int num = 10;
   if (num > 5) {
      num--;
   } else if (num > 7) {
      num *= 2;
   } else if (num > 10) {
      num++;
   } else if (num == 5) {
      num /= 3;
   } else {
      num /= 4;
   }
   System.out.print(num);
}