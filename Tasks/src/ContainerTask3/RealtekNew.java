package ContainerTask3;

import javax.annotation.ParametersAreNonnullByDefault;

import Utils.Validator;

@ParametersAreNonnullByDefault
class RealtekNew implements AnswersTo<RealtekProductType> {

    private final RealtekProductType mProductType;

    RealtekNew(final RealtekProductType productType) {
        Validator.isArgNotNull(productType, "productType");
        mProductType = productType;
    }

    @Override
    public boolean answersTo(final RealtekProductType req) {
        Validator.isArgNotNull(req, "req");
        return req == mProductType;
    }
}
