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
            <a class="nav-link" href="<%=request.getContextPath() +"/adminCompany/doComptes.action"%>">
                <i class="fas fa-building"></i>
                <span>Comptes</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath() +"/adminCompany/doStructures.action"%>">
                <i class="fas fa-fw fa-table"></i>
                <span>Structure</span></a>
        </li>

    </ul>

    <div id="content-wrapper">

        <div class="container-fluid">
        