// Superclass
class Hewan {
    private String nama;
    
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    public void bersuara() {
        System.out.println("Hewan mengeluarkan suara");
    }
    
    public String getNama() {
        return nama;
    }
}

// Subclass 1
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " mengeong: Meong! Meong!");
    }
}

// Subclass 2
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " menggonggong: Guk! Guk!");
    }
}

// Subclass 3
class Sapi extends Hewan {
    public Sapi(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " melenguh: Moo! Moo!");
    }
}

// Main class
public class DemoPolimorfisme {
    public static void main(String[] args) {
        // Membuat array yang berisi berbagai jenis hewan
        Hewan[] hewan = {
            new Kucing("Kitty"),
            new Anjing("Buddy"),
            new Sapi("Bobby"),
            new Kucing("Mimi")
        };
        
        // Polimorfisme: memanggil metode bersuara() yang berbeda-beda
        for (Hewan h : hewan) {
            h.bersuara();
        }
    }
}
