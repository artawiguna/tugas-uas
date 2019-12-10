package app;

class Teknisi extends Akun{

    String permasalahan;
    String profile;
    int reward;

    String melihatprofile(){
        return "view profile";
    }
    String merubahProfile(){
        return "edit profile";
    }
    
    String mengambilOrderan(){
        return "order";
    }
    String melakukanChating(){
        return "Chating dengan pelanggan";
    }
    String melihatreward(){
        return "view reward";
    }
    String melihatInformasiTeknologi(){
        return "teknologi terbaru";
    }
    String menanggapikonsultasi(){
        return "bisa menanggapi konsultasi";
    }
      
}