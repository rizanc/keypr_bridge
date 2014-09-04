package com.cloudkey.pms.response.hotels;

import com.cloudkey.pms.common.hotel.LOVItem;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;

import java.util.List;

/**
 * Created by crizan2 on 04/09/2014.
 */
public class LOVResponse extends PMSResponse {


    private List<LOVItem> lovItems;

    public List<LOVItem> getLovItems() {
        return lovItems;
    }

    public void setLovItems(List<LOVItem> lovItems) {
        this.lovItems = lovItems;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("lovItems", lovItems)
                .toString();
    }
}
