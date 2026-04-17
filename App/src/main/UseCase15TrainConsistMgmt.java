public class UseCase15TrainConsistMgmt {

    // 🔥 Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Model
    static class GoodsBogie {
        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public String getCargo() {
            return cargo;
        }

        public String getShape() {
            return shape;
        }

        // 🔥 Assignment with try-catch-finally
        public void assignCargo(String cargo) {

            try {
                // Rule: Rectangular cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("========================================\n");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe
        b1.assignCargo("Petroleum");

        // ❌ Unsafe
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("\nSystem still running safely...");
    }
}