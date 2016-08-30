/*
 * Copyright 2014-2016 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.admin.client.mvp.view;

import org.kaaproject.avro.ui.gwt.client.widget.grid.AbstractGrid;
import org.kaaproject.avro.ui.gwt.client.widget.grid.event.HasRowActionEventHandlers;
import org.kaaproject.kaa.common.dto.HasId;
import org.kaaproject.kaa.server.admin.client.util.HasErrorMessage;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.view.client.MultiSelectionModel;

public interface BaseListView<T extends HasId> extends IsWidget, HasErrorMessage {

    HasClickHandlers getAddButton();
    HasClickHandlers getBackButton();

    void setBackEnabled(boolean enabled);
    void setAddButtonEnabled(boolean enabled);

    MultiSelectionModel<T> getSelectionModel();
    AbstractGrid<T,String> getListWidget();
    HasRowActionEventHandlers<String> getRowActionsSource();

    void clearError();

    void setErrorMessage(String message);

    void setPresenter(Presenter presenter);

    public interface Presenter {
        void goTo(Place place);
    }

}
