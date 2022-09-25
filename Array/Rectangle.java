package Array;

    public class Rectangle {
        public int x1, x2, y1, y2;
        /**
         * @param x1 -> a cordinates axis
         * @param y1 -> a cordinates axis
         * @param x2 -> a cordinates axis
         * @param y2 -> a cordinates axis
         */
        public Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
        /**
         * Constructor mengambil nilai width dan height
         *
         * @param width
         * @param height
         */
        public Rectangle(int width, int height) {
            this(0, 0, width, height);
        }
        /**
         * Menjumlahkan setiap cordinates dengan parameter
         *
         * @param deltax -> dijumlahkan dengan setiap absis value
         * @param deltay -> dijumlahkan dengan setiap ordinat value
         */
        public void move(int deltax, int deltay) {
            x1 += deltax;
            x2 += deltax;
            y1 += deltay;
            y2 += deltay;
        }
/**
 * Mengecek apakah nilai x dan y ada didalam cordinates
 *
 * @param x -> cek apakah x ada diantara x1 dan x2
 * @param y -> cek apakah y ada diantara y1 dan y2
 * @return mengembalikan nilai true apabila nilai yang dimasukkan ada didalam cordinate
 */
public boolean isInside(int x, int y) {
    return ((x >= x1)) && (x <= x2) && (y >= y1) && (y <= y2);
}
        /**
         * penyatuan dua cordinate menjadi 1
         *
         * @param r -> cordinate baru
         * @return Object Rectangle baru
         */
        public Rectangle union(Rectangle r) {
            return new Rectangle(
                    Math.min(this.x1, r.x1),
                    Math.min(this.y1, r.y1),
                    Math.max(this.x2, r.x2),
                    Math.max(this.y2, r.y2)
            );
        }
        /**
         * Mencari titik menentukan posisi suatu benda
         *
         * @param r -> Object coordinate baru
         * @return new rectangle
         */
        public Rectangle intersection(Rectangle r){
            Rectangle result = new Rectangle(
                    Math.max(this.x1, r.x1),
                    Math.max(this.y1, r.y1),
                    Math.min(this.x2, r.x2),
                    Math.min(this.y2, r.y2)
            );
            if (result.x1 > result.x2) {
                result.x1 = result.x2 = 0;
            }
            if (result.y1 > result.y2) {
                result.y1 = result.y2 = 0;
            }
            return result;
        }
        @Override
        public String toString() {
            return "Rectangle{" +
                    "x1=" + x1 +
                    ", x2=" + x2 +
                    ", y1=" + y1 +
                    ", y2=" + y2 +
                    '}';
        }
    }

