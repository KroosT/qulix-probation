package ContainerTask3;

class RealtekNew implements AnswersTo<RealtekProductType> {

    private final RealtekProductType mProductType;

    RealtekNew(final RealtekProductType productType) {
        mProductType = productType;
    }

    @Override
    public boolean answersTo(final RealtekProductType req) {
        return req == mProductType;
    }
}
