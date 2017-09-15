package br.com.threeway.segsex.locadora.domain;

import java.util.List;

/**
 * Created by Alex on 02/09/2017.
 */
public class LevelAccess {

    private Long id;
    private String name;
    private List<Permission> permissions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LevelAccess that = (LevelAccess) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return permissions != null ? permissions.equals(that.permissions) : that.permissions == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (permissions != null ? permissions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LevelAccess{" +
                "name='" + name + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
