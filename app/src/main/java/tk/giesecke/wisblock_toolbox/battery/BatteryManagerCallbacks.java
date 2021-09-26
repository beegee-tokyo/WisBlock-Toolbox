package tk.giesecke.wisblock_toolbox.battery;

import no.nordicsemi.android.ble.BleManagerCallbacks;
import no.nordicsemi.android.ble.common.profile.battery.BatteryLevelCallback;

public interface BatteryManagerCallbacks extends BleManagerCallbacks, BatteryLevelCallback {
}
