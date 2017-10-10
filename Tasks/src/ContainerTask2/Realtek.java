package ContainerTask2;

class Realtek implements AnswersTo {

    private final String mProductType;

    Realtek(final String productType) {
        mProductType = productType;
    }

    @Override
    public boolean answersTo(final String req) {
        return req.equalsIgnoreCase(mProductType);
    }
}
