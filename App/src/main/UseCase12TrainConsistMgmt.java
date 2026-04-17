import java.util.*;

public class UseCase12TrainConsistMgmt {

    // Goods Bogie Model
    static class GoodsBogie {
        private String type;
        private String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }
    }

    // 🔥 CORE BUSINESS LOGIC (IMPORTANT)
    public static boolean isTrainSafe(List<GoodsBogie> bogies) {

        return bogies.stream().allMatch(bogie -> {

            // Rule: Cylindrical → only Petroleum
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }

            // Other bogies → allowed any cargo
            return true;
        });
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("========================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        boolean isSafe = isTrainSafe(goodsBogies);

        System.out.println("Train Safety Status: " + (isSafe ? "SAFE ✅" : "UNSAFE ❌"));
    }
}