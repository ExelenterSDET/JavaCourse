package Day53.Practice.Malika.Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
    public class Banana extends Fruit {
        private String storeAddress;

        public void setStoreAddress(String storeAddress) {
            this.storeAddress = storeAddress;
        }

        public String getStoreAddress() {
            return storeAddress;
        }

        @Override
        public String toString() {
            return "\n" + getClass().getSimpleName() +
                    " { storeAddress = '" + storeAddress + '\'' +
                    ", name = '" + name + '\'' +
                    ", color = '" + color + '\'' +
                    ", price = " + price +
                    '}';
        }
    }
