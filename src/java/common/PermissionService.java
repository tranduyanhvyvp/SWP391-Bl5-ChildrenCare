/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author stter
 */
public class PermissionService {
    
    /**
     * Phân quyền, uỷ quyền
     * 
     * @param roleId - Quyền user
     * @param controllerName - Chức năng muốn truy cập
     * @return 
     */
    public boolean checkPermission(int roleId, String controllerName) {
        
        if(controllerName == "EditUser") {
            
            if (roleId != 1) {
                // Điều hướng đến url không có quyền 
            }
        }
        return true;
    }
    
}
