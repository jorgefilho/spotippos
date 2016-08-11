package org.github.jorgefilho.spotippos.api.service;

import org.github.jorgefilho.spotippos.api.controller.domain.RequestProperty;
import org.github.jorgefilho.spotippos.api.controller.domain.ResponseProperty;

public interface PropertyService {

	ResponseProperty save(RequestProperty requestProperty);
}
