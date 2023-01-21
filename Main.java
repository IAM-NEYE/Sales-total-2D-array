class Main {
  public static void main(String[] args) {
    int sales[][]={{80,90},{70,40},{30,50}};
    System.out.println(sales[0][0]);
    int total[]={sales[0][0]+sales[1][0]+sales[2][0],sales[0][1]+sales[1][1]+sales[2][1]};
    System.out.println(total[0]); 
  }
}