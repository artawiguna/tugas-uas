package app;

class Pelanggan extends Akun{

    
    String profile;
    int saldo;

    String melihatprofile(){
        return "view profile";
    }
    String merubahProfile(){
        return "edit profile";
    }
    String memasukkanPermasalahan(){
        return "input permasalahan";
    }
    String memesanTeknisi(){
        return "order";
    }
    String menentukanLokasi(){
        return "Set Lokasi";
    }
    String melakukanChating(){
        return "Chating dengan teknisi";
    }

    String melihatSaldo(){
        return "saldo";
    }
    String memberikanReward(){
        return "Reward";
    }
    String melihatInformasiTeknologi(){
        return "teknologi terbaru";
    }
    String konsultasi(){
        return "bisa konsultasi";
    }
      
}