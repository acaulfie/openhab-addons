/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.bluetooth.govee.internal.command.hygrometer;

import javax.measure.Quantity;

import org.openhab.core.library.types.OnOffType;
import org.openhab.core.library.types.QuantityType;

/**
 * @author Connor Petty - Initial contribution
 *
 */
public class WarningSettingsDTO<Q extends Quantity<Q>> {
    public OnOffType enableAlarm;
    public QuantityType<Q> min;
    public QuantityType<Q> max;
}
