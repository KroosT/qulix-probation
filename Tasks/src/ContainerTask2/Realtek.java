package ContainerTask2;

import javax.annotation.ParametersAreNonnullByDefault;

import Utils.Validator;

@ParametersAreNonnullByDefault
class Realtek implements AnswersTo {

    private final String mProductType;

    Realtek(final String productType) {
        Validator.isArgNotNull(productType, "productType");
        mProductType = productType;
    }

    @Override
    public boolean answersTo(final String req) {
        Validator.isArgNotNull(req, "req");
        return req.equalsIgnoreCase(mProductType);
    }
}
