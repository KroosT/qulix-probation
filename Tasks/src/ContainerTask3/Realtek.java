package ContainerTask3;

class Realtek implements AnswersTo<String> {

    private final String mProductType;

    Realtek(final String productType) {
        mProductType = productType;
    }

    @Override
    public boolean answersTo(final String req) {
        return req.equalsIgnoreCase(mProductType);
    }
}
