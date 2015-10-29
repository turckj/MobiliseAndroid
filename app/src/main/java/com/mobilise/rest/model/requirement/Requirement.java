package com.mobilise.rest.model.requirement;

import com.mobilise.rest.model.shared.Category;
import com.mobilise.rest.model.shared.Location;
import com.mobilise.rest.model.shared.User;

/**
 * Created by Turckish on 10/27/2015.
 */
public class Requirement {
    public String description;
    public int id;
    public Location location;
    public Category category;
    public User user;
}
