class diemTrungBinh {
  public static void main(String[] args) {
    double toan, ly, hoa, diemTB;
    toan = Double.parseDouble(args[0]);
    ly = Double.parseDouble(args[1]);
    hoa = Double.parseDouble(args[2]);
    diemTB = (toan + ly + hoa) / 3;
    System.out.println("Diem trung binh la: " + diemTB);
  }
}
