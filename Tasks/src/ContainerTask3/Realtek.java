package ContainerTask3;

import javax.annotation.ParametersAreNonnullByDefault;

import Utils.Validator;

@ParametersAreNonnullByDefault
class Realtek implements AnswersTo<String> {

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
