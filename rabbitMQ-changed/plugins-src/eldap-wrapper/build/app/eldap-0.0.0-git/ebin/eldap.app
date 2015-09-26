{application, eldap,
 [{description, "LDAP Client Library"},
  {vsn,"0.0.0-git"},
  {modules, [
    eldap,
    'ELDAPv3'
  ]},
  {registered, []},
  {applications, [kernel, stdlib]}
 ]}.
