public class Main {
    public static void main(String[] args) {
        Bebek bebek = new Kwek();

        Kucing kwekAdapter = new KwekAdapter(bebek);
        System.out.println("Kucing asli: \nMiaw Miaw" );
        System.out.println("Kucing palsu: ");
        kwekAdapter.suara();
  }
}
