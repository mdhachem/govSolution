<div id="wrapper">

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="#">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Dashboard</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath() +"/superAdmin/doInscription.action"%>">
                <i class="fas fa-building"></i>
                <span>Inscription</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath() +"/superAdmin/doCommandes.action"%>">
                <i class="fas fa-fw fa-table"></i>
                <span>Commandes</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath() +"/superAdmin/doAbonnements.action"%>">
                <i class="fas fa-dollar-sign"></i>
                <span>Abonnements</span>
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath() +"/superAdmin/doModules.action"%>">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Modules</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath() +"/superAdmin/doNotifications.action"%>">
                <i class="fas fa-bell"></i>
                <span>Notifications</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath() +"/superAdmin/doReglements.action"%>">
                <i class="fas fa-wrench"></i>
                <span>Règlements</span></a>
        </li>
    </ul>

    <div id="content-wrapper">

        <div class="container-fluid">
        
        