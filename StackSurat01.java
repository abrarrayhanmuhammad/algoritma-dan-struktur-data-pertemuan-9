public class StackSurat01 {
    Surat01[] surat;
    int top, size;

    public StackSurat01(int size) {
        this.size = size;
        surat = new Surat01[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat01 data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            surat[top] = data;
        }
    }

    public Surat01 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return null;
        } else {
            Surat01 data = surat[top];
            top--;
            return data;
        }
    }

    public Surat01 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return null;
        } else {
            return surat[top];
        }
    }

    public void cari(String nama) {
        boolean ketemu = false;

        for (int i = top; i >= 0; i--) {
            if (surat[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                surat[i].tampil();
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}