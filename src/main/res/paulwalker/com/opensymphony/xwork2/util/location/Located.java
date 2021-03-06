/*
 * Copyright 2005 The Apache Software Foundation.
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
package com.opensymphony.xwork2.util.location;

import com.opensymphony.xwork3.util.location.Locatable;
import com.opensymphony.xwork3.util.location.Location;

/**
 * Base class for location aware objects
 */
public abstract class Located implements Locatable {
    
    protected Location location;
    
    /**
     * Get the location of this object
     * 
     * @return the location
     */
    public Location getLocation() {
        return location;
    }
    
    /**
     * Set the location of this object
     * 
     * @param loc the location
     */
    public void setLocation(Location loc) {
        this.location = loc;
    }
}
